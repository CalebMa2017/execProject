package month02.week01.self;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 */
public class ExampleThreadPool {

    public static void main(String[] args) {
        ExecutorService es = Executors.newScheduledThreadPool(3);
        es.execute(new MyRunnable2());
        es.execute(new MyRunnable2());
        es.execute(new MyRunnable2());
        es.execute(new MyRunnable2());
        es.shutdown();
    }
}
class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" -> "+i);
        }
    }
}


