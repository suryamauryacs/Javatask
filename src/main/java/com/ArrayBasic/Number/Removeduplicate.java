package com.ArrayBasic.Number;

import java.util.Arrays;
import java.util.Scanner;

public class Removeduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ente the arayLike [1,2,3]");
        String input = sc.nextLine();

        int[] arr = StringtoArray(input);

       // System.out.println(arr);

        System.out.println(removeDuplicate(arr));
    }

    public static int[] StringtoArray(String s){
        if(s == null){
            return new int[0];
        }
        s = s.replace("[","").replace("]","").trim();

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();

    }

    public static int removeDuplicate(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

        return i+1;
    }
}
