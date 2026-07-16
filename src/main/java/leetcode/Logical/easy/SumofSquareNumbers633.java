package leetcode.Logical.easy;
//https://leetcode.com/problems/sum-of-square-numbers/description/

import java.util.Scanner;

public class SumofSquareNumbers633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ; ");
        int n = sc.nextInt();

        System.out.println(judgeSquareSum(n));


    }

    public static boolean judgeSquareSum(int c) {
        int left = 0;
        long right = (long)Math.sqrt(c);
        while(left <= right){
            long sum = left*left + right*right;
            if(sum == c){
                return true;
            }else if(sum < c){
                left++;
            }else{
                right--;
            }
        }

        return false;
    }
}
