package Oops.Day1.test.MultiThreading.Four;

import Oops.Day1.test.MultiThreading.First.MyThread;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread4 t1 = new MyThread4(counter);
        MyThread4 t2 = new MyThread4(counter);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){

        }
        System.out.println(counter.getCount());

    }
}
