package com.Stream.program.Problem;

import java.util.Arrays;
import java.util.Scanner;

public class DedupKeepOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array liek [1,2,4]");
        String input = sc.nextLine();

        int[] arr = stringToArray(input);





    }

    public static int[] stringToArray(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\]{}()<>]","").trim();
        if(s.trim().isEmpty())
            return new int[0];
        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }
}
