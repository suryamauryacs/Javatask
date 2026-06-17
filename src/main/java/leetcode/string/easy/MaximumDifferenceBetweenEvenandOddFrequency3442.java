package leetcode.string.easy;

// https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/description/


//3442. Maximum Difference Between Even and Odd Frequency I
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//You are given a string s consisting of lowercase English letters.
//
//Your task is to find the maximum difference diff = freq(a1) - freq(a2) between the frequency of characters a1 and a2 in the string such that:
//
//a1 has an odd frequency in the string.
//a2 has an even frequency in the string.
//Return this maximum difference.
//
//
//
//Example 1:
//
//Input: s = "aaaaabbc"
//
//Output: 3
//
//Explanation:
//
//The character 'a' has an odd frequency of 5, and 'b' has an even frequency of 2.
//The maximum difference is 5 - 2 = 3.
//Example 2:
//
//Input: s = "abcabcab"
//
//Output: 1
//
//Explanation:
//
//The character 'a' has an odd frequency of 3, and 'c' has an even frequency of 2.
//The maximum difference is 3 - 2 = 1.
//
//
//Constraints:
//
//3 <= s.length <= 100
//s consists only of lowercase English letters.
//s contains at least one character with an odd frequency and one with an even frequency.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumDifferenceBetweenEvenandOddFrequency3442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();

        System.out.println(maxDifference(s));
        System.out.println(maxDifferenceOptimal(s));
    }

    public static int maxDifferenceOptimal(String s){
        int[] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(int f : freq){
            if ( f == 0)
                continue;
            if(f % 2 == 1){
                maxOdd = Math.max(maxOdd, f);
            }else{
                minEven = Math.min(minEven, f);
            }
        }

        return maxOdd - minEven;
    }

    public static int maxDifference(String s){
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(int f : map.values()){
            if(f % 2 == 1){
                maxOdd = Math.max(maxOdd, f);
            }
            else{
                minEven = Math.min(minEven, f);
            }
        }

        return maxOdd - minEven;
    }
}
