package Oops.Day1.test.MultiThreading.Second;

import Oops.Day1.test.MultiThreading.First.MyThread;

public class MyThread2 extends  Thread{
    @Override
    public void run() {
      for(int i =0;i<5;i++){
          System.out.println(Thread.currentThread().getName() + " is running");
          Thread.yield();
      }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
//        t1.start();
//        t1.interrupt();

    }
}
