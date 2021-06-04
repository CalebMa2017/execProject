package month01.week04.self;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程练习：死锁
 */
public class SelfThread3 {
    public static void main(String[] args) {

    }
}
class MyRunnable4 implements Runnable {
    private  ReentrantLock rl = new ReentrantLock();
    private int ticket =10;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            rl.lock();
            try{
                if(ticket>0){
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+" -> " +i);
                }
            }finally {
                rl.unlock();
            }
        }
    }
}
