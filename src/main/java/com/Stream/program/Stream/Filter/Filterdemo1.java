package com.Stream.program.Stream.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/// EvenNumber Example using filter stream
///
public class Filterdemo1 {
    public static void main(String[] args) {
//        ArrayList <Integer> numbersList = new ArrayList<Integer>();
//
//        numbersList.add(10);
//        numbersList.add(15);
//        numbersList.add(20);
//        numbersList.add(30);
//        numbersList.add(25);

        List<Integer> numbersList =  Arrays.asList(10,15,20,25,30);
        List<Integer> evenNumberList = new ArrayList<Integer>();

        //without using streams
//
//        for(int n : numbersList){
//            if(n%2 == 0){
//                evenNumberList.add(n);
//            }
//        }
//
//        System.out.println(evenNumberList);


//        evenNumberList = numbersList.stream().filter(n -> n %2 == 0).collect(Collectors.toList());
//        System.out.println(evenNumberList);

      //  numbersList.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(n));
        numbersList.stream().filter(n -> n%2 == 0).forEach(System.out::println);



    }
}
