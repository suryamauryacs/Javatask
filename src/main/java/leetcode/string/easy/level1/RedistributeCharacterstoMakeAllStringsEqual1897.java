package leetcode.string.easy.level1;
//https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/description/


//You are given an array of strings words (0-indexed).
//
//In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].
//
//Return true if you can make every string in words equal using any number of operations, and false otherwise.
//
//
//
//Example 1:
//
//Input: words = ["abc","aabc","bc"]
//Output: true
//Explanation: Move the first 'a' in words[1] to the front of words[2],
//to make words[1] = "abc" and words[2] = "abc".
//All the strings are now equal to "abc", so return true.
//Example 2:
//
//Input: words = ["ab","a"]
//Output: false
//Explanation: It is impossible to make all the strings equal using the operation.

import java.util.Arrays;
import java.util.Scanner;

public class RedistributeCharacterstoMakeAllStringsEqual1897 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words");
        String input = sc.nextLine();

        String[] words = Arrays.stream(input.substring(input.indexOf("[") + 1, input.indexOf("]")).split(","))
                .map(String::trim)
                .map(s -> s.replace("\"", ""))
                .toArray(String[]::new);
        System.out.println("Words: " + Arrays.toString(words));

        System.out.println(makeEqual(words));

    }


    public static boolean makeEqual(String[] words) {
        int[] fre = new int[26];

        for(int i = 0;i<words.length;i++){
            String w = words[i];

            for(int j = 0;j<w.length();j++){
                char ch = w.charAt(j);
                int idx = (int)(ch - 'a');      //finding index of character

                fre[idx] = fre[idx] + 1;
            }
        }

        for(int i = 0;i<26;i++){
            if(fre[i]%words.length != 0){
                return false;
            }
        }

        return true;


    }
}
