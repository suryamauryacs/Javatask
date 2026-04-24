package com.ArrayBasic.Marchpratice.Arrayb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problemfirst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like : [1,2,3,4]");
        String input = sc.nextLine();

        int[] arr = strtoArray(input);

        System.out.println(maxElement(arr));

    }

    public static int maxElement(int[] arr){
        ArrayList<Integer> lst = new ArrayList<>();

        for (int num : arr) {
            lst.add(num);   // convert int[] → ArrayList<Integer>
        }

//        return Collections.max(lst);
        return Collections.min(lst);
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
