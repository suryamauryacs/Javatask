package com.ArrayBasic.Marchpratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//[1,2,3,4,0,-1,2,0,3,4,54,34,0,65,0,-45]

public class MoveAllZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like : [1,2,3,4]");
        String input = sc.nextLine();

        int[] arr = strtoArray(input);
//        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(moveTozero(arr)));
    }

    public static int[] moveTozero(int[] arr){
        ArrayList<Integer> templst = new ArrayList<>();
        ArrayList<Integer> neglst = new ArrayList<>();

        for(int x : arr){
            if(x >= 0){
                templst.add(x);
            }
            else{
                neglst.add(x);
            }
        }

        for(int i = 0;i<templst.size();i++){
            arr[i] = templst.get(i);
        }

        for(int i = templst.size();i<arr.length;i++){
            arr[i] = 0;
        }


        return arr;


    }


    public static int[] strtoArray(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\]<>(){}]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }
}

