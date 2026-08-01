package leetcode.Stack;
//https://leetcode.com/problems/remove-duplicate-letters/description/

import java.util.Scanner;
import java.util.Stack;


//Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
//
//
//
//Example 1:
//
//Input: s = "bcabc"
//Output: "abc"
//Example 2:
//
//Input: s = "cbacdcbc"
//Output: "acdb"
//
//
//Constraints:
//
//1 <= s.length <= 104
//s consists of lowercase English letters.

public class RemoveDuplicateLetters316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String; ");
//        String s = sc.nextLine();
//        s = s.substring(5, s.length()-1);
        String s = sc.nextLine().substring(5).replace("\"", "");
        System.out.println(s);

        System.out.println(removeDuplicate(s));

    }

    public static String removeDuplicate(String s){
        int[] lastIndex = new int[26];

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = (int)(ch - 'a');
            lastIndex[idx] = i;
        }

        boolean[] present = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = (int)(ch - 'a');
            if(present[idx] == false){
                while(st.size() > 0 && st.peek() > ch && lastIndex[(int)(st.peek()-'a')]> i){
                    present[(int)(st.peek()-'a')] = false;
                    st.pop();

                }

                st.push(ch);
                present[idx] = true;
            }
        }

        StringBuilder sb = new StringBuilder("");
        while(st.size() >  0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }


}
