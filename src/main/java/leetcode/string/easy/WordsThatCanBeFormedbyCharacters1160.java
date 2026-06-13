package leetcode.string.easy;

import java.util.Arrays;
import java.util.Scanner;

//Words = ["cat","bt","hat","tree"] chars = "atach"


//1160. Find Words That Can Be Formed by Characters
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//You are given an array of strings words and a string chars.
//
//A string is good if it can be formed by characters from chars (each character can only be used once for each word in words).
//
//Return the sum of lengths of all good strings in words.
//
//
//
//Example 1:
//
//Input: words = ["cat","bt","hat","tree"], chars = "atach"
//Output: 6
//Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
//Example 2:
//
//Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//Output: 10
//Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.


public class WordsThatCanBeFormedbyCharacters1160 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take full line input
        System.out.println("Enter the data like : Words = [\"cat\",\"bt\",\"hat\",\"tree\"] chars = \"atach\"\n" +
                "\n");
        String input = sc.nextLine();


        // split words and chars

        String[] parts = input.split("chars = ");

        String wordPart = parts[0].trim();
        String charPart = parts[1].trim();

        String chars = charPart.replaceAll("[\"]", "");

        wordPart = wordPart.substring(wordPart.indexOf("[") + 1, wordPart.indexOf("]"));
        String[] word = wordPart.replaceAll("\"", "").split(",");

//        System.out.println(chars);
//        System.out.println(Arrays.toString(word));

        System.out.println(countCharacters(word, chars));


    }

    public static int countCharacters(String[] words, String chars) {
        int[] charFeq = new int[26];
        int total = 0;

        for (char c : chars.toCharArray()) {
            charFeq[c - 'a']++;
        }

        for (String word : words) {
            int[] wordFreq = new int[26];
            boolean canForm = true;

            for (char ch : word.toCharArray()) {
                wordFreq[ch - 'a']++;

                if (wordFreq[ch - 'a'] > charFeq[ch - 'a']) {
                    canForm = false;
                    break;
                }
            }
            if (canForm) {
                total += word.length();
            }
        }
        return total;
    }
}
