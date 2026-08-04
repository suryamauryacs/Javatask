package leetcode.Stack;

import java.util.Scanner;
import java.util.Stack;
//


public class ValidParentheses20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();

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
