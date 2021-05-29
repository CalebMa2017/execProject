package morth01.week02;

/**
 * 静态代理
 */
public class StaticProxy {

    public static void main(String[] args) {
        Actor actor = new Actor(20,"易烊千玺");
        Agent agent = new Agent(actor);
        agent.doAction();
    }
}

/**
 * 从开始演戏到结束的行为
 */
interface Action {
    void doAction() ;
}

/**
 * 演员
 */
class Actor implements Action{
    public Actor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Actor() {
    }

    @Override
    public void doAction() {
        System.out.println("我在演戏......");
        for (int i = 0; i < 10000; i++) {
            System.out.print("");
        }
    }
    private int age;
    private String name;
}
/**
 * 代理人
 */
class Agent implements Action{
    private Actor actor;

    public Agent(Actor actor) {
        this.actor = actor;
    }
    public Agent(){}
    @Override
    public void doAction() {
        System.out.println("我在签约.......");
        long start = System.currentTimeMillis();
        actor.doAction();
        long end = System.currentTimeMillis();
        System.out.println("收钱");
        System.out.println("演戏完成，一共花费"+(end-start)/1000.0+"s");
    }
}