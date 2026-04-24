package Sinleton.Part1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//
//        Samosa samosa1 = Samosa.getSamosa();
//        System.out.println(samosa1.hashCode());
//
//        Samosa samosa2 = Samosa.getSamosa();
//        System.out.println(samosa2.hashCode());
//
//        System.out.println(Jalebi.getJalebi().hashCode());
//        System.out.println(Jalebi.getJalebi().hashCode());

        //1. Reflection API to break singleton patttern
        //2. solution 1 -> if object is there ==> throw exception from inside constructor
        //  ii) use enum

//        Samosa s1 = Sinleton.Part1.Samosa.getSamosa();

        Samosa s1 = Samosa.INSTANCE;
        System.out.println(s1.hashCode());
        s1.test();

        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());


    }
}
















