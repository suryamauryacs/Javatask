package leetcode.array.Easy.part3;

import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/maximum-subarray/description/
//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//
//
//
//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Example 2:
//
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum 1.
//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


public class MaximumSubarray53 {
    public static void main(String[] args) {
        System.out.println("Enter the Arrays nums =  [1,2,3]:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] arr =
                Arrays.stream(input.substring(input.indexOf("[")+1, input.indexOf("]")).split(","))
                .filter(s -> ! s.isEmpty()).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(maxSubArray(arr));
    }


}
