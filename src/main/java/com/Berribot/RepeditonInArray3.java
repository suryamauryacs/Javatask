package com.Berribot;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeditonInArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array like [3,3,1]");
        String input = sc.nextLine();

        int[] arr = parseArray(input);

        System.out.println(findDuplicate(arr));

    }

    public static int[] parseArray(String s) {
        if (s == null)
            return new int[0];

        s.trim();

        if (s.startsWith("[") && s.endsWith("]")) {
            s = s.substring(1, s.length() - 1);
        }

        if (s.trim().isEmpty())
            return new int[0];

        String[] parts = s.split(",");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        return arr;

    }

    public static String findDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = new LinkedHashSet<>();

        for (int x : arr) {
            if (!seen.add(x)) {
                dup.add(x);

            }
        }
        if (dup.isEmpty()) {
            return "[No duplicates]";
        } else {
            return dup.toString();
        }
    }

}
