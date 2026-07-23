package leetcode.Searching.BinarySearch;

import java.util.Scanner;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]
//

public class FindFirstandLastPositionofElementinSortedArray34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]");
        String input = sc.nextLine();
        int[] arr = strToArr(input);
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        System.out.println(search(arr, target));
    }
}
