package Sinleton.Part1;

//public enum Samosa {
//
//    INSTANCE;
//
//    public void test(){
//        System.out.println("test method");
//    }

//}


// ************************
//    public class Samosa {
//    private static Samosa samosa;
//    //contructor
//    private Samosa(){
//        if(samosa != null){
//            throw new RuntimeException("You are trying to break singleton pattern");
//        }
//    }

    //Lazy way of creating single object
//    public synchronized static Samosa getSamosa(){      //mathod sync but we need sync block
//    public static Samosa getSamosa(){
//        //object of this class
//
//        if(samosa == null){
//          synchronized (Samosa.class){
//              if(samosa == null) {
//                  samosa = new Samosa();
//              }
//          }
//        }
//
//        return samosa;
//    }

//    public void test(){
//        System.out.println("test method");
//    }
//
//}


//1.constructor private
//2. Object create with the help of method
//3. create field to store object is private


import com.designpattern.day1.Samosa;



























