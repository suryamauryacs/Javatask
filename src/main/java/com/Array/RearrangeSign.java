package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RearrangeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = stringtoArray(input);

       // System.out.println(Arrays.toString(rearrange(arr)));
    }

//    public static int[] rearrange(int[] arr){
//        int[] res = new int[arr.length];
//        int posidx = 0, negidx = 1;
//        for(int i= 0;i<arr.length;i++){
//            if(arr[i] < 0){
//                res[negidx] = arr[i];
//                negidx += 2;
//            }
//            else{
//                res[posidx] = arr[i];
//                posidx += 2;
//            }
//        }
//
//        return res;
//    }



//    public static int[] rearrange(int[] arr){
//        List<Integer> pos = new ArrayList<>();
//        List<Integer> neg = new ArrayList<>();
//
//        for(int x : arr){
//            if(x >= 0) pos.add(x);
//            else neg.add(x);
//        }
//
//        int i = 0, p = 0, n = 0;
//        int[] res = new int[arr.length];
//        while (p < pos.size() && n < neg.size()){
//            res[i++] = pos.get(p++);
//            res[i++] = neg.get(n++);
//        }
//
//        while(p < pos.size()){
//            res[i++] = pos.get(p++);
//        }
//
//        while(n < neg.size()){
//            res[i++] = neg.get(n++);
//        }
//
//        return res;
//    }
public static int[] rearrangeNumber(int[] arr){
   List<Integer> pos= new ArrayList<>();
   List<Integer> neg = new ArrayList<>();

   for(int x : arr){
       if(x >= 0) pos.add(x);
       else neg.add(x);
   }

   int i =0, p= 0, n = 0;
   int[] res = new int[arr.length];
   while (p < pos.size() && n < neg.size()){
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


    public static int[] stringtoArray(String s){
        if(s == null) return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty()) return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer::parseInt).toArray();

    }
}
