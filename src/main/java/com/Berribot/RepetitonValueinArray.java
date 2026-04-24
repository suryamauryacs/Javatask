package com.Berribot;
import java.util.*;

import java.util.Scanner;
import java.util.stream.Stream;

public class RepetitonValueinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]: ");
        String input = sc.nextLine();

        int[] arr = strToArray(input);

//        System.out.println(Arrays.toString(arr));

        System.out.println(duplicateArray(arr));


    }

    public static String duplicateArray(int[] arr){
        Set<Integer> seen = new HashSet<>();

        List<Integer> dup =  java.util.Arrays.stream(arr)
                .filter(x -> !seen.add(x))
                .boxed()
                .toList();

        return dup.isEmpty() ? "No duplicate" : dup.toString();
    }

//    StepMeaning         Arrays.
//    stream(arr)         Stream of numbers
//    filter(x -> !seen.add(x)) Pick only duplicates
//    boxed()Convert to Integer
//    distinct() Remove multiple
//    occurrencestoList() Convert to List

//    public static String duplicateArray(int[] arr){
//
//        Set<Integer> seen = new HashSet<Integer>();
//        LinkedList<Integer> dup = new LinkedList<Integer>();
//
//        for(int val : arr){
//            if(!seen.add(val)){
//                dup.add(val);
//            }
//        }
////        if(dup.isEmpty()){
////            return "[No duplicate]";
////        }
////        else{
////            return dup.toString();
////        }
//
//        return dup.isEmpty() ? "[No duplicate]" : dup.toString();
//    }

    public static int[] strToArray(String s){
        if(s == null)
            return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        s = s.trim();

        return java.util.Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();


    }
}
