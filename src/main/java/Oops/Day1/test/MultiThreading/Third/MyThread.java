package Oops.Day1.test.MultiThreading.Third;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Surya");
        MyThread t2 = new MyThread("Sushant");
        t1.start();
        t2.start();
    }

    //start run sleep join setPriority interrupt yelid
//    Surya is running
//    Surya is running
//    Surya is running
//    Surya is running
//    Surya is running
//    Sushant is running
//    Sushant is running
//    Sushant is running
//    Sushant is running
//    Sushant is running

//using yield();
//    Sushant is running
//    Surya is running
//    Sushant is running
//    Surya is running
//    Sushant is running
//    Surya is running
//    Sushant is running
//    Surya is running
//    Surya is running
//    Sushant is running




}
