package leetcode.Hashkey;

import java.util.Scanner;
//https://leetcode.com/problems/valid-anagram/description/
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//
//Output: true
//
//Example 2:
//
//Input: s = "rat", t = "car"
//
//Output: false


public class ValidAnagram242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = sc.nextLine();
        String[] parts = input.split(",");

        String s = parts[0].substring(parts[0].indexOf("\"") + 1,
                parts[0].lastIndexOf("\""));

        String t = parts[1].substring(parts[1].indexOf("\"") + 1,
                parts[1].lastIndexOf("\""));

        System.out.println("s = " + s);
        System.out.println("t = " + t);

    }
}
