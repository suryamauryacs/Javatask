package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array like: [1,2,3]");
        String input = sc.nextLine();

        int[] arr =  StringToArray(input);
//        System.out.println(Arrays.toString(arr));

        System.out.println(SecondHighestNumber(arr));
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

    public static int SecondHighestNumber(int[] arr){
        int frist = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int x : arr){
            if(x> frist){
                second = frist;
                frist = x;
            } else if(x > second && x!=frist){
                second = x;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}
