package com.Array;

import java.util.*;

public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the like a = [1,2,3] , b = [12,3,2]");
        String input = sc.nextLine();

        int[] a1 = strToArray(input,"a");
        int[] a2 = strToArray(input,"b");

        System.out.println("The array frist: " + Arrays.toString(a1));

        System.out.println("The array frist: " + Arrays.toString(a2));

        System.out.println("the union "+ Arrays.toString(union(a1, a2)));
        System.out.println("the insection "+ Arrays.toString(insection(a1, a2)));


    }




    public static int[] strToArrays(String s, String label){
        int lpos = s.indexOf(label);
        int eqpos = s.indexOf("=",lpos);
        int lbos = s.indexOf("[",eqpos);
        int rbos = s.indexOf("]",lbos+1);

        String inside = s.substring(lbos+1,rbos).trim();

        return Arrays.stream(inside.split(","))
                .map(String::trim)
                .filter(st -> !st.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

    }

    public static int[] insection(int[] a1, int[] a2){
        Set<Integer> set = new HashSet<>();
        for (int x : a1){
            set.add(x);
        }

        Set<Integer> res = new LinkedHashSet<>();
        for (int x :a2){
            if(set.add(x)){
                res.add(x);
            }
        }



        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] union(int[] a1, int[] a2){
        Set<Integer> res = new LinkedHashSet<>();
        for (int x : a1){
            res.add(x);
        }
        for (int x : a2){
            if(!res.add(x)){
                res.add(x);
            }
        }

        int[] newArr = new int[res.size()];
        int i = 0;
        for (int x: res){
            newArr[i++] = x;
        }

        return newArr;

    }

    public static int[] strToArray(String s, String label){
        int lpos = s.indexOf(label);
        int eqpos = s.indexOf("=",lpos);
        int lbos = s.indexOf("[",eqpos);
        int rbos = s.indexOf("]",lbos+1);

        String inside = s.substring(lbos+1,rbos).trim();

        return Arrays.stream(inside.split(","))
                .map(String::trim)
                .filter(st -> !st.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

    }
}
