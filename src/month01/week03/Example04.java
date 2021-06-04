package month01.week03;

/**
 * 静态代理模式（Proxy）
 */
public class Example04 {

    public static void main(String[] args) {
        Actor actor = new Actor();
        Agent agent = new Agent(actor);
        agent.doAction();
    }
}
interface Action {
    void doAction();
}
class Actor implements Action {
    @Override
    public void doAction() {
        for (int i = 0; i < 10000; i++) {
            System.out.print("");
        }
        System.out.println("我在演戏。。。。");
    }
}
class Agent implements Action {
    Actor actor;

    public Agent(Actor actor) {
        this.actor = actor;
    }

    public Agent() {
    }

    @Override
    public void doAction() {
        System.out.println("我在签合同...");
        long start = System.currentTimeMillis();
        actor.doAction();
        long end = System.currentTimeMillis();
        System.out.println("我收钱。。。");
        System.out.println("演戏一共花费了"+(end-start)+"ms");
    }
}