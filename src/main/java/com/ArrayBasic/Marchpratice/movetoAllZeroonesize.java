package com.ArrayBasic.Marchpratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class movetoAllZeroonesize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array: liek [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strToArr(input);


        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(movetoAllZero(arr)));
    }

    public static int[] movetoAllZero(int[] arr){
        ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();
        ArrayList<Integer> zeroList = new ArrayList<>();

        for(int x : arr){
            if(x > 0) {
                posList.add(x);
            }
            else if(x == 0){
                zeroList.add(x);
            }
            else{
                negList.add(x);
            }
        }

        int idx = 0;
        for(int a : posList){
            arr[idx++] = a;
        }

        for(int x : zeroList){
            arr[idx++] = x;
        }

        for(int x : negList){
            arr[idx++] = x;
        }

        return arr;

    }

    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\]<>(){}]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }

    public static int[] strToArs(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\]<>(){}]","");

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String:: trim).mapToInt(Integer::parseInt).toArray();

    }
}
