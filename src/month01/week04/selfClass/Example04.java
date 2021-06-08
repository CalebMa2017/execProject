package month01.week04.selfClass;

import org.junit.Test;

/**
 * 线程应用
 */
public class Example04 {

    public static void main(String[] args) {
        Thread th = new Thread(new MyRunnable());
        th.setName("th");
        Thread th2 = new Thread(new MyRunnable2(th));
        th2.setName("th2");
        th.start();
        th2.start();
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" -> "+i);
        }
    }
}
class MyRunnable2 implements Runnable {
    Thread other ;

    public MyRunnable2(Thread other) {
        this.other = other;
    }

    public MyRunnable2() {
    }

    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i==10) {
                try {
                    other.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+" -> "+i);
        }
    }
}
