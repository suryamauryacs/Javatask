package leetcode.Hashkey;

import java.util.HashMap;
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

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(hm.containsKey(ch) == true){
                hm.put(ch, hm.get(ch) + 1);
            }else{
                hm.put(ch, 1);
            }
        }

        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);

            if(hm.containsKey(ch) == true){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                }else{
                    hm.put(ch, hm.get(ch) - 1);
                }
            }else{
                return false;
            }
        }
        if(hm.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}
