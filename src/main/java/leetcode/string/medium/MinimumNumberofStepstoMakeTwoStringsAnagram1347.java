package leetcode.string.medium;
//https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/description/
//1347. Minimum Number of Steps to Make Two Strings Anagram
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Hint
//You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.
//
//Return the minimum number of steps to make t an anagram of s.
//
//An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
//
//
//
//Example 1:
//
//Input: s = "bab", t = "aba"
//Output: 1
//Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
//Example 2:
//
//Input: s = "leetcode", t = "practice"
//Output: 5
//Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
//Example 3:
//
//Input: s = "anagram", t = "mangaar"
//Output: 0
//Explanation: "anagram" and "mangaar" are anagrams.


import java.util.Scanner;

public class MinimumNumberofStepstoMakeTwoStringsAnagram1347 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    public int minSteps(String s, String t) {
        int[] freq = new int[26];

        for(int c : s.toCharArray()){
            freq[c - 'a']++;
        }
        for(int c : t.toCharArray()){
            freq[c - 'a']--;
        }

        int step = 0;
        for(int count : freq){
            if(count > 0){
                step += count;
            }
        }

        return step;
    }


}
