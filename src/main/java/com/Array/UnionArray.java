package com.Array;

import java.util.*;
import java.util.stream.Collectors;

public class UnionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Arrray like: [1,2,3]");
        String input = sc.nextLine();

        int[] arr1 = strToArrays(input, "a");

        int[] arr2 = strToArrays(input, "b");

        System.out.println("The array is arr1 " + Arrays.toString(arr1));
        System.out.println("The array is arr2 " + Arrays.toString(arr2));

        System.out.println("Union :" + Arrays.toString(union(arr1, arr2)));
        System.out.println("Intersection " + Arrays.toString(intersection(arr1, arr2)));
    }

    public static int[] union(int[] arr1, int[] arr2) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (int x : arr1)
            set.add(x);
        for (int x : arr2)
            set.add(x);

        int[] res = new int[set.size()];
        int i = 0;
        for (int x : set) {
            res[i++] = x;

        }
        return res;
    }

    public static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> setA = new HashSet<>();
        for (int x : arr1) {
            setA.add(x);
        }

        Set<Integer> res = new LinkedHashSet<Integer>();
        for (int x : arr2) {
            if (setA.contains(x)) {
                res.add(x);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] strToArrays(String s, String label) {
        int labelPos = s.indexOf(label);
        int eqpos = s.indexOf("=", labelPos);
        int lbPos = s.indexOf('[', eqpos);
        int rbPos = s.indexOf(']', eqpos + 1);

        String inside = s.substring(lbPos + 1, rbPos);
        if (inside.trim().isEmpty())
            return new int[0];

        return Arrays.stream(inside.split(","))
                .map(String::trim)
                .filter(st -> !st.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

    }

}

//    public static int[] strToArray(String s, String label) {
//        int labelPos = s.indexOf(label);
//        int eqPos = s.indexOf('=', labelPos);
//
//        int lbPos = s.indexOf('[', eqPos);
//        int rbPos = s.indexOf(']', lbPos + 1);
//
//        String inside = s.substring(lbPos + 1, rbPos).trim();
//        if (inside.isEmpty()) {
//            return new int[0];
//        }
//
//        return Arrays.stream(inside.split(","))
//                .map(String::trim)
//                .filter(st -> !st.isEmpty())
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//    }
//}


//    public static int[] strToArrays(String s, String label) {
//        int labelPos = s.indexOf(label);
//        if (labelPos == -1) {
//            throw new IllegalArgumentException("Label '" + label + "' not found.");
//        }
//
//        int eqPos = s.indexOf('=', labelPos);
//        if (eqPos == -1) {
//            throw new IllegalArgumentException("Missing '=' after label '" + label + "'.");
//        }
//
//        int lbPos = s.indexOf('[', eqPos);
//        int rbPos = s.indexOf(']', lbPos + 1);
//        if (lbPos == -1 || rbPos == -1 || rbPos <= lbPos) {
//            throw new IllegalArgumentException("Array brackets '[...]' not found for label '" + label + "'.");
//        }
//
//        String inside = s.substring(lbPos + 1, rbPos).trim();
//        if (inside.isEmpty()) return new int[0];
//
//        try {
//            return Arrays.stream(inside.split(","))
//                    .map(String::trim)
//                    .filter(st -> !st.isEmpty())
//                    .mapToInt(Integer::parseInt)
//                    .toArray();
//        } catch (NumberFormatException e) {
//            throw new IllegalArgumentException("Non-numeric value found in array for label '" + label + "'.", e);
//        }
//    }
//
//    }

//    public static int[] strToArray(String input, String label){
//
//        int labelPos = input.indexOf(label);
////        if (labelPos == -1) {
////            throw new IllegalArgumentException("Label '" + label + "' not found.");
////        }
//
//        // 2) Find '=' after the label
//        int eqPos = input.indexOf('=', labelPos);
////        if (eqPos == -1) {
////            throw new IllegalArgumentException("Missing '=' after label '" + label + "'.");
////        }
//
//        // 3) Find '[' and the matching ']' after '='
//        int lbPos = input.indexOf('[', eqPos);
//        int rbPos = input.indexOf(']', lbPos + 1);
////        if (lbPos == -1 || rbPos == -1 || rbPos <= lbPos) {
////            throw new IllegalArgumentException("Array brackets '[...]' not found for label '" + label + "'.");
////        }
//
//        // 4) Extract the content inside the brackets (e.g., "1,2,3")
//        String inside = input.substring(lbPos + 1, rbPos).trim();
//        if (inside.isEmpty()) {
//            return new int[0];
//        }
//
//        // 5) Split by comma and parse to int[] using streams
//        return Arrays.stream(inside.split(","))
//                .map(String::trim)
//                .filter(s -> !s.isEmpty())
//                .mapToInt(Integer::parseInt)
//                .toArray();
//    }
//
//
//
////        String[] parts = input.split("\\s*,\\s*");
////        String target = Arrays.stream(parts)
////                .map(String::trim)
////                .filter(p -> p.startsWith(label))
////                .findFirst()
////                .orElseThrow(() -> new IllegalArgumentException("Label '" + label + "' not found."));
////
////        String[] eq = target.split("=");
////
////
////        if (eq.length != 2) throw new IllegalArgumentException("Invalid segment for '" + label + "': " + target);
////        String right = eq[1].trim();
////
////
////        if (right.startsWith("[")) right = right.substring(1);
////        if (right.endsWith("]"))   right = right.substring(0, right.length() - 1);
////        right = right.trim();
////
////
////        if (right.isEmpty()) return new int[0];
////
////        return Arrays.stream(right.split(","))
////                .map(String::trim)
////                .mapToInt(Integer::parseInt)
////                .toArray();
////
////
////
//
//
//
//}
