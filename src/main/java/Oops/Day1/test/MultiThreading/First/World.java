package Oops.Day1.test.MultiThreading.First;

public class World implements Runnable{

    @Override
    public void run() {
        for (;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
