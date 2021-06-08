package month02.week01.self;

import java.util.Calendar;

/**
 * 线程练习
 */
public class Example01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ " -> "+i);
        }
    }

    /**
     * 可见 th.interrupt()并没有起作用
     * @param args
     */
    public static void main(String[] args) {
        Thread th = new Thread(new Example01(),"新的线程");
        th.start();
        for (int i = 0; i < 100; i++) {
            if(i==20) {
                th.interrupt();
            }
            System.out.println(Thread.currentThread().getName() + " -> "+i);
        }
    }
}
