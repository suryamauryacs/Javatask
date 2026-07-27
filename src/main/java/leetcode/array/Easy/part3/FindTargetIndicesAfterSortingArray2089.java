package leetcode.array.Easy.part3;
//You are given a 0-indexed integer array nums and a target element target.
//
//A target index is an index i such that nums[i] == target.
//
//Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
//
//
//
//Example 1:
//
//Input: nums = [1,2,5,2,3], target = 2
//Output: [1,2]
//Explanation: After sorting, nums is [1,2,2,3,5].
//The indices where nums[i] == 2 are 1 and 2.
//Example 2:
//
//Input: nums = [1,2,5,2,3], target = 3
//Output: [3]
//Explanation: After sorting, nums is [1,2,2,3,5].
//The index where nums[i] == 3 is 3.
//Example 3:
//
//Input: nums = [1,2,5,2,3], target = 5
//Output: [4]
//Explanation: After sorting, nums is [1,2,2,3,5].
//The index where nums[i] == 5 is 4.

import java.util.Arrays;
import java.util.Scanner;

public class FindTargetIndicesAfterSortingArray2089 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array:");
        String input = sc.nextLine();

        int[] arr = Arrays.stream(input.substring(input.indexOf("[")+1, input.indexOf("]")).split(","))
                .filter(s -> !s.isEmpty()).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

        System.out.println(Arrays.toString(arr));

        int target = Integer.parseInt(input.substring(input.indexOf("target")+8).trim());
        System.out.println(target);

    }
}
