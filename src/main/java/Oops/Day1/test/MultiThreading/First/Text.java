package Oops.Day1.test.MultiThreading.First;

public class Text {
    public static void main(String[] args) {
//        System.out.println("heloo world");
//        System.out.println(Thread.currentThread().getName());

//        Word word = new Word();
//        word.start();
//
//        for (; ;){
//            System.out.println(Thread.currentThread().getName());
//        }
//
//        for (int i = 0;i< 100000;i++){
//            System.out.println("hello world");
//        }

        World world = new World();

        Thread t1 = new Thread(world);      //NEW
        t1.start();     //RUNNABLE

        for(;;){
            System.out.println("Hello");
        }

    }
}
