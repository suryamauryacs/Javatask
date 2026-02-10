package com.ArrayBasic;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,4]:");
        String input = sc.nextLine();

        int[] arr = StringToArray(input);

      //  System.out.println(Arrays.toString(arr));

       // System.out.println(FindLargestElement(arr));

        //System.out.println(Arrays.toString(maxBySorting(arr)));


    }


    public static int[] StringToArray(String s){
        if(s == null){
            return new int[0];
        }

        s = s.trim();

        if(s.startsWith("[") && s.endsWith("]")){
            s = s.substring(1,s.length()-1);
        }

        if(s.trim().isEmpty()){
            return new int[0];
        }

        String[] parts = s.split(",");
        int[] arr = new int[parts.length];
        for(int i = 0;i<parts.length;i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        return arr;
    }


//    public static int SecondLargestNo(int[] arr){
//        int largest= arr[arr.length-1];
//        int seclargest = arr[arr.length-2];
//        for(int i = arr.length-2;i>=0;i--){
//            if(arr[i] != largest){
//                seclargest = arr[i];
//                break;
//            }
//        }
//    }


//    public static int FindLargestElement(int[] arr){
//        int largest = arr[0];
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i] > largest){
//                largest = arr[i];
//            }
//        }
//        return largest;
//    }

//
//    public static int[] maxBySorting(int[] arr){
//        if(arr == null || arr.length == 0){
//            throw new IllegalArgumentException("Array must not be Empty");
//        }
//        int[] copy = Arrays.copyOf(arr, arr.length);
//        Arrays.sort(copy);
//
//        int[] largeMin = new int[2];
//
//        largeMin[0] = copy[copy.length-1];
//        largeMin[1] = copy[copy[0]];
//        return largeMin;
//    }
//



//    public static int FindLargestElement(int[] arr){
//        IntSummaryStatistics state = Arrays.stream(arr).summaryStatistics();
//        if(state.getCount() == 0){
//            throw new IllegalArgumentException("Array must not be Empty");
//
//        }
//        return state.getMax();
//    }


//    public static int FindLargestElement(int[] arr){
//
//        return Arrays.stream(arr).max().orElseThrow(() -> new IllegalArgumentException("Array must not be empty."));
//
//    }
}
