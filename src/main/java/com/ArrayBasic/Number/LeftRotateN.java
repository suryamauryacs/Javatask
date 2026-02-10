package com.ArrayBasic.Number;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array like [1,2,3,4]");
        String input = sc.nextLine();

        System.out.println("enter the d:");
        int d = sc.nextInt();

        int[] arr = StringtoArray(input);

        System.out.println(Arrays.toString(leftArrayRotate(arr, d, arr.length)));

    }

    public static int[] StringtoArray(String s) {
        if (s == null)
            return new int[0];

        s = s.trim();

        if (s.startsWith("[") && s.endsWith("]")) {
            s = s.substring(1, s.length() - 1);
        }

        if (s.trim().isEmpty())
            return new int[0];

        String[] pairs = s.split(",");
        int[] arr = new int[pairs.length];

        for (int i = 0; i < pairs.length; i++) {
            arr[i] = Integer.parseInt(pairs[i]);
        }


        return arr;
    }

    public static int[] leftArrayRotate(int[] arr, int d, int n) {
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        return arr;
    }

    public static int[] reverse(int[] arr, int start, int end){
        while(start <=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;

    }

//    public static int[] leftArrayRotate(int[] arr, int d){
//        d = d % (arr.length);
//        int[] temp = new int[d];
//        for(int i = 0;i< d;i++){
//            temp[i] = arr[i];
//        }
//
//        for(int i =d;i<arr.length;i++){
//            arr[i-d] = arr[i];
//        }
//        for(int i = arr.length-d;i<arr.length;i++){
//            arr[i] = temp[i - (arr.length - d)];
//        }
//
//        return arr;
//    }

}
