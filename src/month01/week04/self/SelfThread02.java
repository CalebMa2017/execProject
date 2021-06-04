package month01.week04.self;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程测试
 */
public class SelfThread02 {
    public static void main(String[] args) {
        Runnable3 run = new Runnable3();
        Thread th1 = new Thread(run);
        Thread th2 = new Thread(run);
        th1.start();
        th2.start();
    }
}
class MyThread3 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            Thread.yield();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyTh"+"->    "+i);
        }
    }
}

/**
 * 创建接口
 */
class Runnable3 implements Runnable {
    private int ticket =10;
    private static ReentrantLock rl= new ReentrantLock();

    /**
     * 用ReentrantLock同步
     */
    @Override

    public void run() {
        for (int i = 0; i < 10; i++) {

            rl.lock();
            try{

                if(ticket-->0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" -> "+ticket);
                }
            }finally {
                rl.unlock();
            }
        }
    }
}
