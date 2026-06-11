package leetcode.array;

//1929. Concatenation of Array
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.
//
//
//
//Example 1:
//
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//- ans = [1,2,1,1,2,1]
//Example 2:
//
//Input: nums = [1,3,2,1]
//Output: [1,3,2,1,1,3,2,1]
//Explanation: The array ans is formed as follows:
//- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
//- ans = [1,3,2,1,1,3,2,1]
//
//brute force
//optimal

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationofArray1929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strtoArray(input);

        System.out.println(Arrays.toString(getConcatenation(arr)));
        System.out.println(Arrays.toString(getConcatenationbest(arr)));
    }

    public static int[] strtoArray(String s){
        if(s == null)
            return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();



    }

    public static int[] getConcatenationbest(int[] nums) {
        int[] res = new int[nums.length*2];

        for(int i = 0;i<nums.length*2;i++){
            res[i] = nums[i % nums.length];
        }

        return res;

    }

    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];

        for(int i = 0;i<nums.length;i++){
            res[i] = nums[i];
            res[i+nums.length] = nums[i];
        }
        return res;

    }




}

