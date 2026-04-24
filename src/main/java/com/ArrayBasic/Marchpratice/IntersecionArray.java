package com.ArrayBasic.Marchpratice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class IntersecionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array: ");
        String input = sc.nextLine();

        int[] arr1 = strToArr(input,"a");
        int[] arr2 = strToArr(input,"b");
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(union(arr1, arr2)));

        System.out.println(Arrays.toString(intersection(arr1, arr2)));


    }

    public static int[] intersection(int[] arr1, int[] arr2){
        LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
        LinkedHashSet<Integer> res = new LinkedHashSet<Integer>();

        for(int x : arr1)
            set1.add(x);

        for (int x: arr2){
            if(set1.contains(x)){
                res.add(x);
            }
        }

        return res.stream().mapToInt(Integer:: intValue).toArray();
    }

    public static int[] intersections(int[] arr1, int[] arr2) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
            for(int x : arr1)
                set.add(x);

            for(int x : arr2){
                if(set.contains(x)){
                    res.add(x);
                }
            }

            return res.stream().mapToInt(Integer::intValue).toArray();
    }


    public static int[] union(int[] arr1, int[] arr2){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int x : arr1)
            set.add(x);

        for(int x : arr2)
            set.add(x);

//        int[] res = new int[set.size()];
//        int i = 0;
//        for(int x : set)
//            res[i++] = x;
//
//        return res;
        return set.stream().mapToInt(Integer:: intValue).toArray();
    }

    public static int[] strToArr(String s, String label){
        int labpos = s.toLowerCase().indexOf(label.toLowerCase());
        int eqpos = s.indexOf("=", labpos);
        int lbpos = s.indexOf("[", eqpos);
        int rbpos = s.indexOf("]",eqpos+1);

        String inside = s.substring(lbpos+1,rbpos);

        if(inside.trim().isEmpty())
            return new int[0];

        return Arrays.stream(inside.split(",")).map(String::trim).filter(x -> !x.isEmpty()).mapToInt(Integer::parseInt).toArray();

    }
}
