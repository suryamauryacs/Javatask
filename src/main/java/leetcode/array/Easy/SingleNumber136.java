package leetcode.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/single-number/description/?envType=problem-list-v2&envId=array

//136. Single Number
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [2,2,1]
//
//Output: 1
//
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//
//Output: 4
//
//Example 3:
//
//Input: nums = [1]
//
//Output: 1
//
//
//
//Constraints:
//
//1 <= nums.length <= 3 * 104
//-3 * 104 <= nums[i] <= 3 * 104
//Each element in the array appears twice except for one element which appears only once.
//


public class SingleNumber136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array like : [1,2,3}");
        String input = sc.nextLine();

        int[] arr = strToarr(input);

        System.out.println(singleNumber(arr));


    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int n : nums){
            res = res ^ n;
        }

        return res;
    }

    public static int[] strToarr(String s){
        if(s == null)
            return new int[0];

//        s = s.replaceAll("[\\[\\]<>(){}","");
        s = s.replace("[","").replace("]","").trim();


        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();



    }
}
