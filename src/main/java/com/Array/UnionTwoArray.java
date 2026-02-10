package com.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UnionTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]:");
        String input1 = sc.nextLine();

        int[] arr1 = StringToArray(input1);

        System.out.println("Enter the Array like [1,2,3]:");
        String input2 = sc.nextLine();

        int[] arr2 = StringToArray(input2);

        //System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(UnionUnique(arr1,arr2)));
    }

    public static int[] UnionUnique(int[] arr1, int[] arr2){
        HashSet<Integer> set = new LinkedHashSet<>();

        for (int x : arr1) set.add(x);
        for (int x : arr2) set.add(x);

        int[] res =  new int[set.size()];
        int i = 0;
        for (int val : set) res[i++] = val;

        return res;
    }

    public static int[] StringToArray(String s){
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
