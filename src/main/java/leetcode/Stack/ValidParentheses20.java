package leetcode.Stack;

import java.util.Scanner;
import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses/description/

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//
//
//Example 1:
//
//Input: s = "()"
//
//Output: true
//
//Example 2:
//
//Input: s = "()[]{}"
//
//Output: true
//
//Example 3:
//
//Input: s = "(]"
//
//Output: false
//
//Example 4:
//
//Input: s = "([])"
//
//Output: true
//
//Example 5:
//
//Input: s = "([)]"
//
//Output: false




public class ValidParentheses20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = sc.nextLine();



        String s = input.substring(
                input.indexOf("\"") + 1,
                input.lastIndexOf("\"")
        );

        System.out.println(s);


        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '[' || ch == '{' || ch == '('){
                st.push(ch);
            }else if(st.size() > 0 && ch == ']' && st.peek() == '['){
                st.pop();
            }else if(st.size() > 0 && ch == '}' && st.peek() == '{'){
                st.pop();
            }else if(st.size() > 0 && ch == ')' && st.peek() == '('){
                st.pop();
            }else{
                return false;
            }
        }

        if(st.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}
