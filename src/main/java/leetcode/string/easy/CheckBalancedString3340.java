package leetcode.string.easy;

import java.util.Scanner;
//https://leetcode.com/problems/check-balanced-string/

//3340. Check Balanced String
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//You are given a string num consisting of only digits. A string of digits is called balanced if the sum of the digits at even indices is equal to the sum of digits at odd indices.
//
//Return true if num is balanced, otherwise return false.
//
//
//
//Example 1:
//
//Input: num = "1234"
//
//Output: false
//
//Explanation:
//
//The sum of digits at even indices is 1 + 3 == 4, and the sum of digits at odd indices is 2 + 4 == 6.
//Since 4 is not equal to 6, num is not balanced.
//Example 2:
//
//Input: num = "24123"
//
//Output: true
//
//Explanation:
//
//The sum of digits at even indices is 2 + 1 + 3 == 6, and the sum of digits at odd indices is 4 + 2 == 6.
//Since both are equal the num is balanced.

public class CheckBalancedString3340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println(isBalanced(str));


    }

    public static boolean isBalanced(String num) {
        int even_sum = 0;
        int odd_sum = 0;
        for(int i = 0;i<num.length();i++){
            int digit = num.charAt(i) - '0';
            if(i % 2 == 0){
                even_sum += digit;
            }else{
                odd_sum += digit;
            }
        }

        return even_sum == odd_sum;

    }
}
