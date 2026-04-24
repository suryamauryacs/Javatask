package Oops.Day1.test.MultiThreading.Second;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
//        System.out.println("Thread is running");

    for (int i = 0;i<5;i++){
        String a = "";
        for(int j = 0;j<10000;j++){
            a += "a";
        }
        System.out.println(Thread.currentThread().getName()
        +" - Priority: " + Thread.currentThread() + " count " + i);
    }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1= new MyThread("surya");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        MyThread l = new MyThread("Low Priority Thread");
        MyThread m = new MyThread("Medium Priority Thread");
        MyThread h = new MyThread("high Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);

        m.setPriority(Thread.NORM_PRIORITY );
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();

        m.start();
        h.start();

        //start run sleep join setPriotiy interrupt



//        t1.join()
    }
}
