package com.ArrayBasic;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,4]");
        String input = sc.nextLine();

        //System.out.println(Arrays.toString(parseArray(input)));
        //System.out.println(SumofArray(parseArray(input)));
        int[] arr = parseArray(input);

        System.out.println(SumofArray(arr,0));



    }

    public static int SumofArray(int[] arr,int idx){
        if(idx == arr.length) return 0;
        return arr[idx] + SumofArray(arr,idx+1);
    }

//    public static int SumofArray(int[] arr){
//        int sum = 0;
//        for(int i = 0;i<arr.length;i++){
//            sum = sum + arr[i];
//        }
//
//        return sum;
//    }

//    public static int SumofArray(int[] arr){
//        return Arrays.stream(arr).sum();
//    }

//    public static int SumofArray(int[] arr){
//        return Arrays.stream(arr).parallel().sum();
//    }



    public static int[] parseArray(String s){
        if(s == null) return new int[0];

        s = s.replace("[","").replace("]","").trim();
        if(s.isEmpty()) return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }

}
