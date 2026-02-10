package com.ArrayBasic;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Arraay like [12,32,3254,3242323,432]");
        String input = sc.nextLine();

        int[] arr = StringtoArray(input);

       // System.out.println(Arrays.toString(arr));
        int k = RemoveDupicate(arr);
        for(int i = 0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] StringtoArray(String s){
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

        String[] pairs = s.split(",");
        int[] arr = new int[pairs.length];

        for(int i = 0;i<pairs.length;i++){
            arr[i] = Integer.parseInt(pairs[i]);
        }

        return arr;
    }

    public static int RemoveDupicate(int[] arr){
        int i = 0;
        for(int j = 1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
