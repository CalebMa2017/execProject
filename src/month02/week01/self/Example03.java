package month02.week01.self;

/**
 * Example03:
 */
public class Example03 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(Thread.currentThread().isInterrupted());
        }
    }

    public static void main(String[] args) {
        Thread th = new Thread(new Example03());
        th.start();
        th.interrupt();
    }
}