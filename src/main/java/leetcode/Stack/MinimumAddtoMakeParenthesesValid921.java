package leetcode.Stack;

import java.util.Scanner;

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

        System.out.println(isValid(s));
    }
}
