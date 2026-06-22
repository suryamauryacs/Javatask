package com.designpattern.day1;

//public enum Samosa{
//    INSTANCE;
//
//    public void test(){
//        System.out.println("Test method");
//    }
//}

import java.io.Serializable;

public class Samosa implements Serializable, Cloneable {


    private static Samosa samosa;


    // Contructor


    private Samosa(){
//        if(samosa != null){
//            throw new RuntimeException("you are trying to break single pattern");
//        }
    }

//    //Lazy way of Creating single object
//    public static Samosa getSomosa(){
//        // object of this class
//        if(samosa == null){
//            samosa = new Samosa();
//        }
//
//        return samosa;
//    }
//

    //Lazy way of Creating single object
    public  static Samosa getSomosa(){
        // object of this class
        if(samosa == null){
            synchronized (Samosa.class){
                if(samosa == null){
                    samosa = new Samosa();

                }
            }
        }

        return samosa;
    }


    public Object readResolve(){
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}


/*

1. Contructor private
2. object create with the help of method;
3. create field to store object is private



 */