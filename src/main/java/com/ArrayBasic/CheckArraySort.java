package com.ArrayBasic;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,32,1]:");
        String input = sc.nextLine();

        int[] arr = StringToArray(input);

        System.out.println(Arrays.toString(arr));

        System.out.println(ReturnArraySort(arr));

    }

    public static int[] StringToArray(String s){
        if(s == null){
            return new int[0];
        }

        s = s.trim();

        if(s.startsWith("[") && s.endsWith("]")){
            s = s.substring(1,s.length()-1);
        }

        String[] pairs = s.split(",");
        int[] arr = new int[pairs.length];

        for(int i = 0;i<pairs.length;i++){
            arr[i] = Integer.parseInt(pairs[i]);
        }

        return arr;
    }

    public static boolean ReturnArraySort(int[] arr){

        boolean temp = false;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] >= arr[i-1]){
                temp = true;
            }
            else{
                temp = false;
            }
        }

        return temp;
    }
}
