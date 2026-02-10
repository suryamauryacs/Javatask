package com.Stream.program.Stream.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2,3,4,5);

        List<Integer> multipliedList = new ArrayList<Integer>();

        //Before

//        for(int num: numberList){
//            System.out.println(num*3);
//        }
//
//        for (int num: numberList){
//            multipliedList.add(num*3);
//        }
//
//        System.out.println(multipliedList);
        //Using stream.map concept
//        multipliedList = numberList.stream().map(num -> num*3).collect(Collectors.toList());
//        System.out.println(multipliedList);

        numberList.stream().map(num -> num*3).forEach(n -> System.out.println(n));

    //    numberList.stream().map(num -> num*3).forEach(System.out::println);
    }
}
