//package com.Array;
//
//import java.awt.*;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class AllZeroToEnd {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the array like: [1,2,3]");
//        String input = sc.nextLine();
//
//        int[] arr = StringtoArray(input);
////        System.out.println(Arrays.toString(arr));
//
//        System.out.println(allZeroToEnd(arr));
//    }
//
//
//
//
//    public static int[] StringtoArray(String s ){
//        if(s == null)
//            return new int[0];
//        s = s.replace("[","").replace("]","").trim();
//
//        if(s.isEmpty()){
//            return new int[0];
//        }
//
//        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
//
//    }
//
//    public static String allZeroToEnd(int[] arr){
//
//        int idx = 0;
//        for(int i =0;i<arr.length;i++){
//            if(arr[i] != 0)
//                arr[idx] = arr[i];
//
//        }
////
////        while(idx < arr.length)
////            arr[idx] = 0;
////
////
////    }
//
//}
