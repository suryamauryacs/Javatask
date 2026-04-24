package com.ArrayBasic.Marchpratice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class UnionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array: ");

        String input = sc.nextLine();

        int[] arr1 = strToArr(input,"a");
        int[] arr2 = strToArr(input,"b");

        System.out.println("The array is arr1 " + Arrays.toString(arr1));
        System.out.println("The array is arr2 " + Arrays.toString(arr2));

        System.out.println("The union of array: " + Arrays.toString(union(arr1, arr2)));

    }

    public static int[] strToArr(String s, String label){
            int lebalPos = s.toLowerCase().indexOf(label.toLowerCase());
            int eqpos = s.indexOf("=",lebalPos);
            int lbpos = s.indexOf("[",eqpos);
            int rbpos = s.indexOf("]",lbpos+1);

            String inside = s.substring(lbpos+1,rbpos);

            if(inside.trim().isEmpty())
                return new int[0];

            return Arrays.stream(inside.split(",")).map(String::trim).filter(x -> !x.isEmpty()).mapToInt(Integer::parseInt).toArray();
    }

    public static int[] strtoArrs(String s , String labal){
        int labpos = s.toLowerCase().indexOf(labal.toLowerCase());
        int eqpos = s.indexOf("=",labpos);
        int lbpos = s.indexOf("[",eqpos);
        int rbpos = s.indexOf("]",lbpos+1);

        String inside = s.substring(lbpos+1,rbpos);

        if(s.trim().isEmpty())
            return new int[0];

        return Arrays.stream(inside.split(",")).map(String::trim).filter(x -> !x.isEmpty()).mapToInt(Integer::parseInt).toArray();
    }


    public static int[] union(int[] arr1, int[] arr2){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int x : arr1){
            set.add(x);
        }

       for(int x : arr2){
           set.add(x);
       }

//       int[] res = new int[set.size()];
//       int idx = 0;
//        for(int x : set){
//            res[idx++] = x;
//        }
//        return res;

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

//    public static int[] strToArrays(String s, String label) {
//        int labelPos = s.indexOf(label);
//        int eqpos = s.indexOf("=", labelPos);
//
//        // Find ANY opening bracket type
//        int lbPos = -1;
//        char open = 0, close = 0;
//        char[] opens = {'[', '{', '('};
//        char[] closes = {']', '}', ')'};
//
//        for (int i = 0; i < opens.length; i++) {
//            int pos = s.indexOf(opens[i], eqpos);
//            if (pos != -1) {
//                lbPos = pos;
//                open = opens[i];
//                close = closes[i];
//                break;
//            }
//        }
//
//        if (lbPos == -1) return new int[0];
//
//        // Find matching closing bracket
//        int rbPos = s.indexOf(close, lbPos + 1);
//        if (rbPos == -1) return new int[0];
//
//        // Extract inside content
//        String inside = s.substring(lbPos + 1, rbPos).trim();
//        if (inside.isEmpty()) return new int[0];
//
//        return Arrays.stream(inside.split(","))
//                .map(String::trim)
//                .filter(st -> !st.isEmpty())
//                .mapToInt(Integer::parseInt)
//                .toArray();
//    }
}
