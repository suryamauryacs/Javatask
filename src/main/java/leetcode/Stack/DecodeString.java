package leetcode.Stack;

import java.util.Scanner;
import java.util.Stack;


//      3[a]2[bc]
//      aaabcbc


public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the String : ");
        String s = sc.nextLine();

        System.out.println(decodeString(s));


    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();

        int k = 0;
        StringBuilder current = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            }
            else if (c == '[') {
                countStack.push(k);
                strStack.push(current);
                k = 0;
                current = new StringBuilder();
            }
            else if (c == ']') {
                int repeat = countStack.pop();
                StringBuilder prev = strStack.pop();

                for (int i = 0; i < repeat; i++) {
                    prev.append(current);
                }

                current = prev;
            }
            else {
                current.append(c);
            }
        }

        return current.toString();
    }

//    public static String decodeString(String s){
//        Stack<Integer> countStack = new Stack<>();
//        Stack<StringBuilder> strStack = new Stack<>();
//
//        int k = 0;
//        StringBuilder current = new StringBuilder();
//        for(char c : s.toCharArray()){
//            if(Character.isDigit(c)){
//                k = k * 10 + (c - '0');
//            }
//            else if(c == '[')
//                {
//                    countStack.push(k);
//                    strStack.push(current);
//                    k = 0;
//                    current = new StringBuilder();
//            }
//            else{
//                current.append(c);
//            }
//
//        }
//        return current.toString();
//
//    }
}
