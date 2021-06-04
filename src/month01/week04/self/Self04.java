package month01.week04.self;

//import morth01.week04.Runnable3;

public class Self04 {

    public static void main(String[] args) {
//        Thread th01 = new MyThread();
//        Thread th02 = new Thread(new MyRunnable());
//        Thread th03 = new Thread(()-> {
//            for (int i = 0; i < 100; i++) {
//                System.out.println(i);
//            }
//        });
//        th01.start();
//        th02.start();
//        th03.start();
        Thread th01 = new MyThread("0");
        Thread th02 = new Thread(new MyRunnable(),"-1");
        Thread th03 = new Thread(new MyRunnable(),"--2");
        Thread th04 = new MyThread("---3");
        Thread th05 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+"\t-> "+i);
                }
            }
        },"----4");
        th01.start();
        th02.start();
        th03.start();
        th04.start();
        th05.start();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"\t-> "+i);
        }
    }

    public MyThread(Runnable3 runnable3) {
    }

    public MyThread(String name) {
        super(name);
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"\t-> "+i);
        }
    }
}

