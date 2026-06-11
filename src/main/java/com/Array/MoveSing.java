package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MoveSing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array like [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strtoArray(input);
//        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(moveToSing(arr)));
    }

    public static int[] moveToSing(int[] arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int x : arr){
            if(x>= 0){
                pos.add(x);
            }else {
                neg.add(x);
            }
        }
        int i = 0, p = 0, n = 0;
        int[] res = new int[arr.length];
        while(p < pos.size() && n < neg.size()){
            res[i++] = pos.get(p++);
            res[i++] = neg.get(n++);
        }

        while(p < pos.size()){
            res[i++] = pos.get(p++);
        }

        while(n < neg.size()){
            res[i++] = neg.get(n++);
        }

        return res;


    }


    public static int[] moveTosings(int[] arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int x : arr){
            if(x >= 0)
                pos.add(x);
            else
                neg.add(x);


        }

        int i =0,p = 0, n = 0;
        int[] res = new int[arr.length];

        while(p < pos.size() && n < neg.size()){
            res[i++] = pos.get(i++);
            res[i++] = pos.get(i++);
        }

        while(p < pos.size()){
            res[i++] = pos.get(i++);
        }

        while(p < neg.size()){
            res[i++] = neg.get(i++);
        }

        return res;
    }

    public static int[] strtoArray(String s){
        if(s == null)
            return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();



    }

    public static  int[] strtoArrays(String s){
        if(s == null)
            return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }
}
