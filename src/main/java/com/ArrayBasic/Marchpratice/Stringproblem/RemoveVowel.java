package com.ArrayBasic.Marchpratice.Stringproblem;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();

//        System.out.println(removeVowel(input));
//         System.out.println(reverseString(input));

//        System.out.println(checkPolidrone(input,reverseString(input)));

//        System.out.println(countVowel(input));

//        System.out.println(removeDuplicateCharacter(input));

        System.out.println(countOccurCh(input));

//        System.out.println(NonRepCh(input));

//         String input2 = sc.nextLine();
//        System.out.println(chechkAnagram(input,input2));

//        System.out.println(countWord(input));



    }

//    🔹 Q8. Count Words in Sentence
    public static int countWord(String s){
        String[] word = s.split(" ");
        return word.length;
    }
//    🔹 Q7. Check Anagram
    public static String chechkAnagram(String s1, String s2){
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b) ? "Anagram" : "Not Anagram";
    }

//    🔹 Q6. Find First Non‑Repeating Character
    public static Character NonRepCh(String s){
        HashMap<Character, Integer> res = new HashMap<>();

        for(char ch: s.toCharArray()){
            res.put(ch, res.getOrDefault(ch, 0) + 1);
        }

        for(char ch : s.toCharArray()){
            if(res.get(ch) == 1){
                return ch;
            }
        }

        return null;
    }


//    🔹 Q5. Count Occurrence of Each Character
    public static Map<Character, Integer> countOccurCh(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }

    //    Q4. Remove Duplicate Characters
    public static String removeDuplicateCharacter(String s){
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(res.indexOf(String.valueOf(ch)) == -1){
                res.append(ch);
            }
        }

        return res.toString();

    }

//    public static String removeDuplicateCharacter(String s){
//        String res = "";
//        for(char ch : s.toCharArray()){
//            if(res.indexOf(ch) == -1){
//                res += ch;
//            }
//        }
//
//        return res;
//    }

//    🔹 Q3. Count Vowels in String
    public static int countVowel(String s){
        int count = 0;
        for(char ch : s.toCharArray()){
            if("AEIOUaeiou".indexOf(ch) != -1){
                count++;
            }
        }

        return count;
    }



//🔹 Q2. Check Palindrome
    public static String checkPolidrone(String s, String rev){
        return s.equals(rev) ? "Palindrome" : "Not Palindrome";
    }

//Q1. Reverse a String
    public static String removeVowels(String s){
        return s.replaceAll("[AEIOUaeiou]","").trim();
    }

    //reverse String

//    public static String reverseString(String s){
//        return new StringBuilder(s).reverse().toString();
//    }

    public static String reverseString(String s){
        String res = "";
        for(int i = s.length()-1;i>=0;i--){
            res += s.charAt(i);
        }
        return res;
    }

    //remvoe Vowel in word
    public static String removeVowel(String s){
        StringBuilder sb = new StringBuilder();
        String vowel = "AEIOUaeiou";

        for(char ch : s.toCharArray()){
            if(vowel.indexOf(ch) == -1){
                sb.append(ch);
            }
        }
    return sb.toString();
    }
}
