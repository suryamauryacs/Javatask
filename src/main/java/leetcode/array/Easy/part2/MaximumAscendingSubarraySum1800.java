package leetcode.array.Easy.part2;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/maximum-ascending-subarray-sum/description/
//Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.
//
//A subarray is defined as a contiguous sequence of numbers in an array.
//
//
//
//Example 1:
//
//Input: nums = [10,20,30,5,10,50]
//Output: 65
//Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
//Example 2:
//
//Input: nums = [10,20,30,40,50]
//Output: 150
//Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
//Example 3:
//
//Input: nums = [12,17,15,13,10,11,12]
//Output: 33
//Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
//
//
//Constraints:
//
//1 <= nums.length <= 100
//1 <= nums[i] <= 100

public class MaximumAscendingSubarraySum1800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]");
        String input = sc.nextLine();
        int[] arr = strToArr(input);
        System.out.println(maxAscendingSum(arr));

    }

    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];
        s = s.replaceAll("[\\[\\]<>\\(\\)\\{\\}]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();
    }

    public static int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int currmax = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1] < nums[i]){
                currmax = currmax + nums[i];
            }else{
                max = Math.max(max, currmax);
                currmax = nums[i];
            }
        }

        max = Math.max(max, currmax);
        return max;
    }


}
