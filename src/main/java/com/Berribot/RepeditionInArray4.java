package com.Berribot;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RepeditionInArray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array like [1,2,4]:");

        String input = sc.nextLine();

        int[] arr = parsetoStringtoArray(input);
        System.out.println(Arrays.toString(arr));
        //System.out.println(findDuplicate(arr));
    }

//    public static int[] parsetoStringtoArray(String s){
//        if(s == null){
//            return new int[0];
//        }
//
//        s = s.trim();
//        if(s.startsWith("[") && s.endsWith("]")){
//            s = s.substring(1,s.length()-1);
//        }
//        if(s.trim().isEmpty()){
//            return new int[0];
//        }
//        String[] parts = s.split(",");
//        int[] arr = new int[parts.length];
//
//        for(int i = 0;i<parts.length;i++){
//            arr[i] = Integer.parseInt(parts[i]);
//        }
//
//        return arr;
//
//    }

    public static int[] parsetoStringtoArray(String s){
        if(s == null) return new int[0];

        s = s.trim();
        if(s.startsWith("[") && s.endsWith("]")){
            s = s.substring(1,s.length()-1);
        }

        if(s.trim().isEmpty()){
            return new int[0];
        }

        String[] pairs = s.split(",");
        int[] arr = new int[pairs.length];

        for(int i = 0;i<pairs.length;i++){
            arr[i] = Integer.parseInt(pairs[i]);
        }

        return arr;
    }

    public static String findDuplicate(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dup = new LinkedHashSet<>();

        for(int x : arr){
            if(!seen.add(x)){
                dup.add(x);
            }
        }

        if(dup.isEmpty()){
            return "[No duplicate]";
        }
        else{
            return dup.toString();
        }
    }
}
