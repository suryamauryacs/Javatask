package com.ArrayBasic;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class SortByFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array like: [12,3,42]");
        String input = sc.nextLine();

        int[] arr = StringtoArray(input);

//        System.out.println(Arrays.toString(arr));

   //     System.out.println(SortByFreqNumber(arr));
    }

    public static int[] StringtoArray(String s){
        if(s == null) return new int[0];

        s = s.replace("[","").replace("]","").trim();

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();

    }

//    public static int[] SortByFreqNumber(int[] arr){
//      //  Map<Integer, Integer>
//    }
}
