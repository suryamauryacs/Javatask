package com.Berribot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array like [1,2,42]:");
        String input = sc.nextLine();

        int[] arr = parseArraytoInteger(input);



        System.out.println(Arrays.toString(rearrangeAlternatingStable(arr)));
    }

    public static int[] parseArraytoInteger(String s){
        if(s == null)
            return new int[0];

        s = s.trim();

        if(s.startsWith("[") && s.endsWith("]")){
            s = s.substring(1,s.length()-1);
        }

        if(s.trim().isEmpty()){
            return new int[0];
        }

        String[] parts = s.split(",");
        int[] arr = new int[parts.length];

        for(int i=0;i<parts.length;i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        return arr;
    }

    public static int[] rearrangeAlternatingStable(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int x: arr){
            if(x >=0)
                pos.add(x);
            else
                neg.add(x);
        }

        int[] res = new int[arr.length];
        int i = 0,p=0,q=0;

        boolean takepos = true;

        while(p < pos.size() && q < neg.size()){
            if(takepos){
                res[i++] = pos.get(p++);
            }
            else{
                res[i++] = neg.get(q++);
            }

            takepos = !takepos;
        }

        while(p < pos.size()) res[i++] = pos.get(p++);
        while(q < neg.size()) res[i++] = neg.get(q++);

        return res;
    }
}
