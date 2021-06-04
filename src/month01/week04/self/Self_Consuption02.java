/*
package month01.week04.self;

*/
/**
 * 消费者和生产者
 *//*

public class Self_Consuption02 {

    public static void main(String[] args) {

    }
}

*/
/**
 * 食物
 *//*

class Special {
    //定义标记变量  目的是先生产后消费 默认是false
    private boolean flag;

    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    //吃饭
    public synchronized void eat() {
        System.out.println(name + " -> "+desc);
    }
    //获取食物
    public synchronized void setSpecial(String name,String desc) {
        this.name = name;
        this.desc = desc;
    }

}

*/
/**
 * 消费者
 *//*

class Consumer2 implements Runnable {
    private Special Special;

    public Consumer2(Special Special) {
        this.Special = Special;
    }

    public Consumer2() {

    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {

        }
    }
}
*/
/**
 * 生产者
 *//*

class Producer2 implements Runnable {
    private Special Special;
    public Producer2(Special Special) {
        this.Special = Special;
    }
    public Producer2() {

    }
    @Override
    public void run() {
        for(int i=0;i<20;i++) {
            if(i%2==0) {
                Special.setSpecial("鱼香肉丝","酸甜口味");
            }else {
                Special.setSpecial("麻婆豆腐","麻辣口味");
            }
        }
    }
}
*/
