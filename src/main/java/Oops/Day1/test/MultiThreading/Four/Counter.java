package Oops.Day1.test.MultiThreading.Four;

public class Counter {
    private int count = 0;

//    public void increment(){
//        synchronized (this){
//            count++;
//        }
//    }

    //cretical section
    public synchronized  void increment(){
            count++;
    }
    public int getCount(){
        return count;
    }
}
