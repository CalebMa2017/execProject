package month01.week04.self;

/**
 * 线程自我练习
 * 这是一个失败的案例因为作用域的事情
 */
public class SelfThread {

    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1("th-1");
        th1.start();
        for (int i = 0; i < 100; i++) {
            Thread.yield();
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            if(i==20) {
////                th1.interrupt();
//                th1.setFlag(true);
//            }
            System.out.println(Thread.currentThread().getName()+ " ->      " + i );
        }
    }
}
class MyThread1 extends Thread{
    public MyThread1(String th_01) {
        super(th_01);
    }
    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if(flag) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
//                this.interrupt();
            }
//            Thread.yield();
            System.out.println(Thread.currentThread().getName()+ " -> " + i );
        }
    }
}

/**
 * 这个类没有用
 */
class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " -> " +i);
        }
    }
}