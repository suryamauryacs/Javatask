package com.ArrayBasic;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the Array like [1,2,4]");;
        String input = sc.nextLine();

        int[] arr = StringToArray(input);
        System.out.println(Arrays.toString(arr));

        System.out.println(RemoveDuplicatesPreserveOrder(arr));
    }

    public static int[] StringToArray(String s){
        if(s == null)
            return new int[0];
        s = s.trim();

        if(s.startsWith("[") && s.endsWith("]")){
            s = s.substring(1,s.length()-1);
        }

        if(s.isEmpty()){
            return new int[0];
        }

        String part[] = s.split(",");
        int[] arr = new int[part.length];

        for(int i = 0;i< part.length;i++){
            arr[i] = Integer.parseInt(part[i]);
        }

        return arr;

    }

    public static String RemoveDuplicatesPreserveOrder(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();

        for(int x: arr)
            set.add(x);

        int[] res = new int[set.size()];
        int i = 0;
        for(int x : set){
            res[i++] = x;
        }
        return Arrays.toString(res);
    }
}
