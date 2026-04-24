package karat.assigment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//2. Input : "NZA team is appearing for berribot assessment" find the ovels frequency in this string
public class VowelFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        Map<Character, Integer> res =countFreqVowel(input);

        res.forEach((k, v) -> System.out.println(k + " = " + v));

    }

    public static Map<Character, Integer> countFreqVowel(String s){

        s = s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for (char v : "aeiou".toCharArray()) {
            map.put(v, 0);
        }


        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
        }

        return map;

    }
}

//NZA team is appearing for berribot assessment
