package com.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RepArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array like: [1,2,3]");
        String input = sc.nextLine();

        int[] arr = strtoArray(input);

//        System.out.println(Arrays.toString(arr));

        System.out.println(duplicateArray(arr));

    }

    public static String duplicateArray(int[] arr){
        HashSet<Integer> dup = new HashSet<Integer>();
        LinkedHashSet<Integer> seen = new LinkedHashSet<Integer>();

        for(int x : arr){
            if(!seen.add(x)){
                dup.add(x);
            }
        }

        return dup.isEmpty() ? "[NO DUPLICATE]" : dup.toString();
    }


    public static int[] strtoArray(String s){
        if(s == null)
            return new int[0];
        s = s.replace("[","").replace("]","").trim();

        if(s.trim().isEmpty()){
            return new int[0];
        }

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }
}
