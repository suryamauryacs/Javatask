package Oops.Day1.test.MultiThreading.Four;

public class MyThread4 extends Thread{
    private Counter counter;

    public MyThread4(Counter counter) {
        this.counter = counter;
    }


    @Override
    public void run(){
        for(int i = 0;i<1000;i++){
            counter.increment();
        }
    }
}
