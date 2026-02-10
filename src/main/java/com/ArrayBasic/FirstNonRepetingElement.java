package com.ArrayBasic;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepetingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like : [1,2,43]");
        String input = sc.nextLine();

        int[] arr = StringtoArray(input);

   //     System.out.println(Arrays.toString(arr));

        System.out.println(FirstNonReating(arr));
    }


    public static int[] StringtoArray(String s){
        if(s == null)
            return new int[0];
        s = s.replace("[","").replace("]","").trim();

        return Arrays.stream(s.split(",")).map(String:: trim).mapToInt(Integer::parseInt).toArray();
    }

    public static int FirstNonReating(int[] arr){
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for(int x : arr){
            freq.put(x, freq.getOrDefault(x,0)+1);
        }

        int ans = -1;
        for(Map.Entry<Integer, Integer> e: freq.entrySet()){
            if(e.getValue() == 1){
                ans = e.getKey();
                break;
            }
        }

        return ans;
    }
}
