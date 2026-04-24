package com.Berribot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array liek [1,2,3,4]: ");
        String input = sc.nextLine();

        int[] arr = strToArray(input);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(reArrangeArray(arr)));
    }


//    Rearrange Array Elements by Sign Given an array arr of size n,
//    rearrange it in an alternating positive and negative manner without changing
//    the relative order of positive and negative numbers. If there are extra
//    positive or negative numbers, place the remaining elements at the end of the array.
//    The rearranged array must start with a positive number, and 0 should be
//    considered as positive.
//Explanation: Rearrange the given array into alternating positive
// and negative elements while preserving the original order within
// each sign group. Start with a positive (including zero). If one sign runs out,
// place the remaining elements of the other sign at the end.
//
//1Example 1
    // [1, 2, 3, -4, -1, 4]
    // [1, -4, 2, -1, 3, 4]

//    [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
    // [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
    public static int[] reArrangeArray(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int x : arr){
            if(x >= 0)
                pos.add(x);
            else
                neg.add(x);
        }

        int p = 0, i = 0, n = 0;
        int[] res = new int[arr.length];
        boolean takepos = true;
        while(p < pos.size() && n < neg.size()){
            if(takepos)
                res[i++] = pos.get(p++);
            else
                res[i++] = neg.get(n++);

            takepos = !takepos;
        }

        while(p < pos.size()) {
            res[i++] = pos.get(p++);
        }
        while(n < neg.size()){
            res[i++] = neg.get(n++);
        }

        return res;

    }


    public static int[] strToArray(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\]<>(){}]","");

        if(s.isEmpty())
            return new int[0];



        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }
}
