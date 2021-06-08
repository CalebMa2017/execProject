package month02.week01.self;

/**
 * 线程
 */
public class Example02{
    public static void main(String[] args) {
        Thread th = new Thread(new MyRunnable());
        Thread th2 = new Thread(new MyRunnable1());
        th.start();
        for (int i=0;i<100;i++) {
            if(i==10){
                th.interrupt();
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" -> "+i);
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" -> "+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
//                return;
                System.out.println(Thread.currentThread().isInterrupted());
            }
        }
    }
}
class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" -> "+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}