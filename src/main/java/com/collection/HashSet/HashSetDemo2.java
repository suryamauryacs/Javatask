package com.collection.HashSet;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);

        System.out.println("HashSet: "+evenNumber); //HashSet: [2, 4, 6]

        HashSet <Integer> numbers = new HashSet<Integer>();

        numbers.addAll(evenNumber);
        numbers.add(10);

        System.out.println("New HashSet:"+numbers);

        //removeAll()

        numbers.removeAll(evenNumber);
        System.out.println(numbers);    //[10]


    }
}
