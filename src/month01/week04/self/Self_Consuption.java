package month01.week04.self;

/**
 * 消费者和生产者
 */
public class Self_Consuption {

    public static void main(String[] args) {
        //只创建一个对象
        Thing thing = new Thing();
        Consumer cs = new Consumer(thing);
        Producer pd = new Producer(thing);
        //创建两个线程并执行
        Thread th01 = new Thread(cs,"consumer");
        Thread th02 = new Thread(pd,"producer");
        th01.start();
        th02.start();
    }
}

/**
 * 创建Thing
 */
class Thing{
    //两个属性
    private String taste ;

    private int name;
    //get and set
    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
    public synchronized void consume() {
        System.out.println(name+ " -> "+taste);
    }
    public synchronized void produce(int name,String taste) {
        this.name = name;
        this.taste = taste;
    }

}

/**
 * 消费者
 */
class Consumer implements Runnable{
    private Thing thing ;

    public Consumer() {
    }

    public Consumer(Thing thing) {
        this.thing = thing;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thing.consume();
        }
    }
}

/**
 * 生产者
 */
class Producer implements Runnable {
    private Thing thing ;
    private final int name1 = 1000;
    private final String taste1= "0000口味";

    private final int name2 = 1111;
    private final String taste2 = "1111口味";

    public Producer() {
    }

    public Producer(Thing thing) {
        this.thing = thing;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%2==0) {
                thing.produce(name1,taste1);
            } else {
                thing.produce(name2,taste2);
            }
        }
    }
}