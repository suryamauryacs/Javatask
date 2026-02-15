package Oops.Day1.test.MultiThreading.First;

public class Word extends Thread{

    @Override
    public void run() {
        for (int i = 0;i< 10000;i++){
            System.out.println("hello world");
        }
    }
}
