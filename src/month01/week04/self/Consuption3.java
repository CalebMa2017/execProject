package month01.week04.self;

/**
 * 消费者与生产者  公用资源
 * 先消费再生产
 */
public class Consuption3 {

    public static void main(String[] args) {
        Special sp = new Special();
        Thread th1 = new Thread(new RunnableProducer(sp),"pro");
        Thread th2 = new Thread(new RunnableConsumer(sp),"con");
        th1.start();
        th2.start();
    }
}

/**
 * 定义消费者线程的run方法
 */
class RunnableConsumer implements Runnable{
    Special special;

    public RunnableConsumer() {
    }

    public RunnableConsumer(Special Special) {
        this.special = Special;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            special.eat();
        }
    }
}
/**
 * 定义生产者线程的run方法
 */
class RunnableProducer implements Runnable {
    Special special;
    public RunnableProducer(Special special) {
        this.special = special;
    }

    public RunnableProducer() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%2==0) {
                special.make("鱼香肉丝",29);
            }else {
                special.make("宫保鸡丁",31);
            }
        }
    }
}
/**
 * 定义菜品类
 */
class Special {
    private String name;
    private int price;

    private boolean flag;
    public Special(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Special() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Special{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * 定义消费方法
     */
    public synchronized void eat() {
        if(!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("I eat "+name+", this special is "+price+"$");
        this.notify();
        flag = true;
    }

    /**
     * 定义制作食物方法
     * @param name
     * @param price
     */
    public synchronized void make(String name,int price) {
        if(flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.price = price;
        this.notify();
        flag = false;
    }
}
