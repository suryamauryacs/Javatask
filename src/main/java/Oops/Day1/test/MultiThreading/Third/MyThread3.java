package Oops.Day1.test.MultiThreading.Third;


public class MyThread3 extends Thread {

    public MyThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
            System.out.println("hello Wrold !");
        }
    }

    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("Surya");
        t1.setDaemon(true);
        MyThread3 t2 = new MyThread3("Sushant");
        t2.start();
        t1.start();

        System.out.println("Main done");
    }

    //start run sleep join setPriotiy interrupt yeild setDaemon
}

