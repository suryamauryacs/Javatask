package com.ArrayBasic.Number;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Array like [1,2,3]");
        String input = sc.nextLine();

        int[] arr = StringtoArray(input);

       // System.out.println(arr);
        System.out.println(Arrays.toString(ratateArray(arr)));
    }

    public static int[] StringtoArray(String s){
        if(s == null){
            return new int[0];
        }
        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }

    public static int[] ratateArray(int[] arr) {
        int temp = arr[0];
        for(int i = 1;i<arr.length;i++){
            arr[i-1] = arr[i];

        }
        arr[arr.length-1] = temp;
        return arr;
    }
}
