package leetcode.Stack;

import java.util.Scanner;
import java.util.Stack;
//  https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/

//A parentheses string is valid if and only if:
//
//It is the empty string,
//It can be written as AB (A concatenated with B), where A and B are valid strings, or
//It can be written as (A), where A is a valid string.
//You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
//
//For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
//Return the minimum number of moves required to make s valid.
//
//
//
//Example 1:
//
//Input: s = "())"
//Output: 1
//Example 2:
//
//Input: s = "((("
//Output: 3
//


public class MinimumAddtoMakeParenthesesValid921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = sc.nextLine();
        String s = input.substring(
                input.indexOf("\"") + 1,
                input.lastIndexOf("\"")
        );
        System.out.println(s);

        System.out.println(minAddToMakeValid(s));
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(ch);
            }else if(st.size() > 0 && st.peek() == '('){
                st.pop();
            }else{
                count += 1;
            }
        }

        return st.size() + count;
    }

}
