package com.designpattern.day1;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {

    public static void main(String[] args) throws NoSuchMethodException,CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

//        Samosa samosa = Samosa.getSomosa();
//
//        System.out.println(samosa.hashCode());
//
//        Samosa samosa2 = Samosa.getSomosa();
//
//        System.out.println(samosa2.hashCode());
//
//
//        System.out.println(Jalebi.getJalebi().hashCode());
//        System.out.println(Jalebi.getJalebi().hashCode());


        /*

        ₹1. Reflection API to break singleton pattern
        solution : 1 -> if object is there ==> throw exeption from inside contructor
        2-> use enum

        2.-> Deserialization :
        solution : implement readResolve method


       3. cloning


         */

//        Samosa s1 = Samosa.getSomosa();
//        System.out.println(s1.hashCode());
//
//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());


//        Samosa s1 = Samosa.INSTANCE;
//        System.out.println(s1.hashCode());
//        s1.test();
//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());


//        Samosa samosa = Samosa.getSomosa();
//        System.out.println(samosa.hashCode());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(samosa);
//
//        System.out.println("serialization done..");
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa s2 = (Samosa) ois.readObject();
//        System.out.println(s2.hashCode());
//


        Samosa samosa = Samosa.getSomosa();
        System.out.println(samosa.hashCode());
        Samosa s3 = (Samosa) samosa.clone();
        System.out.println(s3.hashCode());

    }
}
