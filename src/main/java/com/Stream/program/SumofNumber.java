package com.Stream.program;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class SumofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = stringtoArray(input);

      //  System.out.println(evenNumberSum("Even Number sum="+arr));

    }

    public static int evenNumberSum(int[] arr){
        int sum = Arrays.stream(arr).filter(n -> n %2 == 0).sum();

        return sum;
    }

    public static int[] stringtoArray(String s){
        if(s == null){
            return new int[0];
        }

        s = s.replace("[","").replace("]","").trim();
        if(s.trim().isEmpty()){
            return new int[0];
        }


        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();

    }

}
