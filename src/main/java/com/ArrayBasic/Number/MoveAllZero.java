package com.ArrayBasic.Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]:");;
        String input = sc.nextLine();

        int[] arr = StringtoArray(input);
        //System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(moveZeroLast(arr)));
    }



    public static int[] moveZeroLast(int[] arr){
        ArrayList<Integer> temp =  new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
            temp.add(arr[i]);
        }}

        for(int i =0;i<temp.size();i++){
            arr[i]= temp.get(i);
        }

        for(int i = temp.size(); i<arr.length;i++){
            arr[i] = 0;
        }

        return arr;
    }

    public static int[] StringtoArray(String s){
        if(s== null)
            return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }
}
