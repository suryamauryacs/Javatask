package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ener the Array like :[12,3,42,3]:");
        String input = sc.nextLine();

        int[] arr = StringToArray(input);
//        System.out.println(Arrays.toString(arr));

        System.out.println(removeDuplicateNumber(arr));
    }

    public static int[] StringToArray(String s){
        if(s == null){
            return new int[0];
        }

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }

    public static int removeDuplicateNumber(int[] arr){
        if(arr.length == 0) return 0;
        int k = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[k++] = arr[i];
            }
        }
        return k;
    }
}
