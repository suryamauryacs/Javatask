package leetcode.string.easy;

import java.util.Scanner;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
//1832. Check if the Sentence Is Pangram
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//
//
//Example 1:
//
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
//Example 2:
//
//Input: sentence = "leetcode"
//Output: false
//


public class CheckPangram1832 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entger the String ");
        String str = sc.nextLine();

        System.out.println(checkIfPangram(str));

    }

    public static boolean checkIfPangram(String sentence) {
        int[] visit = new int[26];

        if(sentence.length() < 26){
            return false;
        }

        for(char ch : sentence.toCharArray()){
            visit[ch - 'a']++;
        }

        for(int a : visit){
            if(a == 0){
                return false;
            }
        }

        return true;

    }
}
