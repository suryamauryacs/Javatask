package com.Berribot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class reArrangeArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array like: [1,2,3] ");
        String input = sc.nextLine();

        int[] arr = strToArr(input);

        System.out.println(Arrays.toString(arr));

        System.out.println(reArrange(arr));
    }

    //1Example 1
    // [1, 2, 3, -4, -1, 4]
    // [1, -4, 2, -1, 3, 4]

    //    [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
    // [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\]<>(){}]","");

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }

    public static int[] reArrange(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int x : arr){
            if(x >= 0)
                pos.add(x);
            else
                neg.add(x);
        }

        int i = 0, p = 0, n = 0;
        int[] res = new int[arr.length];

        boolean takepos = true;
        while(p < pos.size() && n < neg.size());
        {
            if(takepos){
                res[i++] = pos.get(p++);
            }
            else {

                res[i++] = pos.get(n++);
            }
            takepos = !takepos;
        }

        while(p < pos.size()){
            res[i++] = pos.get(p++);
        }

        while(n < neg.size()){
            res[i++] = neg.size();
        }

        return res;
    }

}
