package month01.week04.self;

/**
 * 线程死锁
 */
public class Self_ThreadDeath {
    public static void main(String[] args) {
//        MyRunnable001 mr = new MyRunnable001();
//        Thread th = new Thread(mr);
//        th.start();
        new MyRunnable001();
//        System.out.println("hhhhhh");
    }
}
class MyRunnable001 implements Runnable{
    Customer c = new Customer();
    Waiter w = new Waiter();
    @Override
    public void run() {
        w.say1(c);
    }
    public MyRunnable001() {
        new Thread(this).start();
        c.say(w);
    }
}
class Customer{
    public void say(Waiter w){
        System.out.println("吃饭->结账");
        w.toDo2();
    }
    public void toDo() {
        System.out.println("我同意，结账->吃饭");
    }
}
class Waiter {
    public void say1(Customer c) {
        System.out.println("结账->吃饭");
        c.toDo();
    }
    public void toDo2() {
        System.out.println("我同意，吃饭->结账");
    }
}
