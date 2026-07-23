package leetcode.Searching.BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
//Example 3:
//
//Input: nums = [1], target = 0
//Output: -1

import java.util.Arrays;
import java.util.Scanner;

public class SearchinRotatedSortedArray33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String input = sc.nextLine();

        String[] parts = input.split(",\\s*target\\s*=\\s*");
        int[] nums = strToArr(parts[0].replace("nums","").replace("=","").trim());

        int target = Integer.parseInt(parts[1]);

        System.out.println("Array =" + Arrays.toString(nums));

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target <= nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <=  nums[end]){
                    start = mid + 1;

                }else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\](){}<>]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

    }
}
