package leetcode.Searching.BinarySearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

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
//
//Constraints:
//
//0 <= nums.length <= 105
//-109 <= nums[i] <= 109
//nums is a non-decreasing array.
//-109 <= target <= 109

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindFirstandLastPositionofElementArray34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array:");
        String input = sc.nextLine();

        String[] parts = input.split("\\s*target*\\s=*\\s*");

        int[] nums = strToArr(parts[0].replace("nums", "").replace("=", "").trim());
        int target = Integer.parseInt(parts[1]);

        System.out.println(Arrays.toString(searchRange(nums, target)));


    }

    public static int[] strToArr(String s) {
        if (s == null)
            return new int[0];
        s = s.replaceAll("[\\[\\](){}]", "").trim();
        if (s.isEmpty())
            return new int[0];
        return Arrays.stream(s.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length == 0){
            return ans;
        }
        ans[0] = firstOccurance(nums, target);
        ans[1] = lastOccurance(nums,target);

        return ans;
    }
    public static int lastOccurance(int[] num, int target){
        int start = 0;
        int end = num.length-1;
        int ans = -1;

        while(start <= end){
            int mid = (start + end)/2;

            if(num[mid] == target){
                ans = mid;
                start = mid+1;
            }else if(target > num[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return ans;
    }

    public static int firstOccurance(int[] num, int target){

        int start = 0;
        int end = num.length-1;
        int ans = -1;

        while(start <= end){
            int mid = (start + end)/2;

            if(num[mid] == target){
                ans = mid;
                end = mid-1;
            }else if(target > num[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return ans;

    }
}
