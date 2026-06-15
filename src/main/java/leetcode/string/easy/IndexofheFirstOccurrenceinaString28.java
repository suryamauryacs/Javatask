package leetcode.string.easy;

//28. Find the Index of the First Occurrence in a String
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//
//
//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//Example 2:
//
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.
//
//
//Constraints:
//
//1 <= haystack.length, needle.length <= 104
//haystack and needle consist of only lowercase English characters.

//   haystack = "sadbutsad", needle = "sad"
//      haystack = "leetcode", needle = "leeto"

import java.util.Scanner;

public class IndexofheFirstOccurrenceinaString28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String input = sc.nextLine();

        String[] parts = input.split(",");
        String haystackpart = parts[0];
        String haystack = haystackpart.split("=")[1].replaceAll("\"","").trim();

        String needlePart = parts[1];
        String needle = needlePart.split("=")[1].replaceAll("\"","").trim();

//        System.out.println(haystack + " " + needle) ;

        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        for(int i = 0; i<= m -n ;i++){
            int j = 0;

            while(j < n && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j == n){
                return i;
            }
        }
        return -1;
    }
}
