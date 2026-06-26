package leetcode.Stack;

import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the String : ");
        String s = sc.nextLine();

        System.out.println(decodeString(s));


    }

    public static String decodeString(String s){
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();

        int k = 0;
        StringBuilder current = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                k = k + 10 + (c - '0');
            }
            else if(c == '[')
                {
                    countStack.push(k);
            }
        }

    }
}
