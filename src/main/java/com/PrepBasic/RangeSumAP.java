package com.PrepBasic;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSumAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the L and R (inclusive R");
        String line = sc.nextLine().trim();



        line = line.replaceAll("[\\[\\]{}()<>]", "").trim();

//        line = line.replace("{", "").replace("}","")
//                .replace("[","").replace("]","")
//                .replace("<","").replace(">","")
//                .replace("(","").replace(")","").trim();


        int[] vals = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();

        if(vals.length!=2 ){
            throw new IllegalArgumentException("Invalid input. Excepted like [2,9]");

        }
        int L = vals[0];
        int R = vals[1];

        int left = Math.min(L,R);
        int right = Math.max(L,R);

        long count  = (long) right - left +1;
        long sum = count * (left + right) /2;

        System.out.println("Sum Form "+ left + "to "+right+ " = "+sum);


          //     System.out.println(sumInRangeFromStringLoop(input));


    }


}
