package com.designpattern.day1;

public class Samosa {

    private static Samosa samosa;


    // Contructor


    private Samosa(){

    }

    public static Samosa getSomosa(){
        // object of this class
        if(samosa == null){
            samosa = new Samosa();
        }

        return samosa;
    }

}


/*

1. Contructor private
2. object create with the help of method;
3. create field to store object is private



 */