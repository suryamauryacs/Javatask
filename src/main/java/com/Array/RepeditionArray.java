package com.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RepeditionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array like [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strintoArray(input);

        System.out.println(duplicateValeu(arr));
    }

    public static String duplicateValeu(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        LinkedHashSet<Integer> dup = new LinkedHashSet<>();

       for(int x : arr){
           if(!seen.add(x)){
               dup.add(x);
           }
       }

       return dup.isEmpty() ? "[No Duplicate]" : dup.toString();
    }




    public static int[] strintoArray(String s){
        if(s == null) return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.trim().isEmpty()){
            return new int[0];
        }


        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }

}
