
package com.Berribot;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RepetitionInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---- Step 1: Take user input like [4, 3, 5, 2, 1] ----
        System.out.print("Enter array like [4, 3, 5, 2, 1]: ");
        String input = sc.nextLine();

        // ---- Step 2: Convert String → int[] ----
        int[] arr = parseArray(input);

        // ---- Step 3: Find duplicates ----
        String result = findDuplicates(arr);

        // ---- Step 4: Print output ----
        System.out.println(result);

        sc.close();
    }

    // Convert "[4, 3, 5, 2, 1]" → int[]
    public static int[] parseArray(String s) {
        if (s == null) return new int[0];
        s = s.trim();

        // Remove [ ]
        if (s.startsWith("[") && s.endsWith("]")) {
            s = s.substring(1, s.length() - 1);
        }

        // Handle empty array like "[]" or ""
        if (s.trim().isEmpty()) return new int[0];

        String[] parts = s.split(",");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }
        return arr;
    }

    // Return "[No duplicates]" or "[x, y, ...]"
    public static String findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = new LinkedHashSet<>(); // Maintains order of first duplicate occurrence

        for (int x : arr) {
            if (!seen.add(x)) {  // x is duplicate
                dup.add(x);
            }
        }

        // ✅ Always return a String before method ends
        if (dup.isEmpty()) {
            return "[No duplicates]";
        } else {
            return dup.toString(); // e.g., "[3, 5]"
        }
    }
}
