package month02.week01.self;

import javax.management.remote.rmi._RMIConnection_Stub;

/**
 * 生产者与消费者操作公共资源
 */
public class Example04 {
    public static void main(String[] args) {
        Table t = new Table();
        Thread factory = new Thread(new Factory(t));
        Thread waiter = new Thread(new Waiter(t));
        factory.start();
        waiter.start();
    }
}
class Table {
    private String name;
    private int num;

    /**
     * 生产操作：需要同步，不能多人生产
     */
    public synchronized void produce(String name ,int num) {
        System.out.println("生产 "+name+" -> "+num);
        setName(name);
        setNum(num);
        this.notify();
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 消费
     */
    public synchronized void consume() {
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------------------消费------------------------"+name+" -> "+num);
        this.notify();
    }
    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Table() {
    }

    public Table(String name, int num) {
        this.name = name;
        this.num = num;
    }
}

/**
 * 服务员
 */
class Waiter implements Runnable{
    private Table table;

    public Waiter(Table table) {
        this.table = table;
    }

    public Waiter() {

    }

    @Override
    public void run() {
        int i;
        for (i = 0; i < 20; i++) {
            table.consume();
        }
        if(i==20) {
            System.out.println("服务员下班========");
        }

    }
}

/**
 * 工厂
 */
class Factory implements Runnable {
    private Table table;

    public Factory(Table table) {
        this.table = table;
    }

    public Factory() {
    }

    @Override
    public void run() {
        int i;
        for (i = 0; i < 20; i++) {
            if(i%2==0) {
                table.produce("华为",1);
            }else {
                table.produce("苹果",2);
            }
        }
        if (i==20) {
            System.out.println("工厂停产=========");
        }
    }
}