package com.ArrayBasic.Marchpratice.Stringproblem;

import java.util.Arrays;
import java.util.Scanner;

public class StringProblem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entert the String: ");
        String input = sc.nextLine();

//        System.out.println(Arrays.toString(countUpperLower(input)));
        System.out.println(replaceCh(input));

        System.out.println(countDigit(input));
    }


//    16. Count Digits in String
    public static int countDigit(String s){
        int count = 0;
        int res = 0;
        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                count++;
                res += Character.getNumericValue(s.charAt(i));

            }
        }

        return res;
    }

//    10. Replace Character in String
//    Input: "banana" replace a with o
//    Output: "bonono
    public static String replaceCh(String s){
        String res = "";
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                res += 'o';
            }
            else{
                res += s.charAt(i);
            }
        }
        return res;
    }

//  9. Count Uppercase & Lowercase Characters
    public static int[] countUpperLower(String s){
        int[] res = new int[2];
        int up= 0, lw = 0;

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                up++;
            }

            else if(c >= 'a' && c <= 'z'){
                lw++;
            }


        }

        res[0] = up;
        res[1] = lw;

        return res;
    }
}
