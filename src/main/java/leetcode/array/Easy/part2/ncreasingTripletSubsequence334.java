package leetcode.array.Easy.part2;

import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/increasing-triplet-subsequence/description/
//iven an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4,5]
//Output: true
//Explanation: Any triplet where i < j < k is valid.
//Example 2:
//
//Input: nums = [5,4,3,2,1]
//Output: false
//Explanation: No triplet exists.
//Example 3:
//
//Input: nums = [2,1,5,0,4,6]
//Output: true
//Explanation: One of the valid triplet is (1, 4, 5), because nums[1] == 1 < nums[4] == 4 < nums[5] == 6.
//


public class ncreasingTripletSubsequence334 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]");
        String input = sc.nextLine();
        int[] arr = strToArr(input);
        System.out.println(increasingTriplet(arr));
    }

    public static boolean increasingTriplet(int[] nums) {
        int fn = Integer.MAX_VALUE;
        int sn = Integer.MAX_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(fn >= nums[i]){
                fn = nums[i];
            }else if(sn >= nums[i]){
                sn = nums[i];
            }else{
                return true;
            }
        }
        return false;
    }

    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];
        s = s.replaceAll("[\\[\\]<>\\(\\)\\{\\}]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();
    }

}
