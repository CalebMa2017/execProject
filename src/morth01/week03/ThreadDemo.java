package morth01.week03;


/**
 * 线程练习
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        Thread t2 = new Thread(new MyRunnable2());
        t1.start();
        t2.start();
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("11111111111111---------"+i);
        }
    }
}
class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("sleep抛出了异常");
            }
            System.out.println(i);
        }
    }
}
