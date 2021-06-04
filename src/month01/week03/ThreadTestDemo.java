package month01.week03;

public class ThreadTestDemo {

    public static void main(String[] args) {
        Thread th = new Thread(new MyRunnable());
//        th.setName("***");
        th.start();
        MyThread mt = new MyThread();
//        mt.setName("-------");
        mt.start();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
