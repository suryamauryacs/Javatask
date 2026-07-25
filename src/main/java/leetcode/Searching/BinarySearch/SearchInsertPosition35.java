package leetcode.Searching.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

//  https://leetcode.com/problems/search-insert-position/description/
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
//
//
//Constraints:
//
//1 <= nums.length <= 104
//-104 <= nums[i] <= 104
//nums contains distinct values sorted in ascending order.
//-104 <= target <= 104

public class SearchInsertPosition35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array like: [1,2,3]");
        String input = sc.nextLine();

        int stpos = input.indexOf("[");
        int endpos = input.indexOf("]");
        String newStr = input.substring(stpos + 1, endpos);

        int[] arr = Arrays.stream(newStr.split(",")).map(String :: trim).mapToInt((Integer :: parseInt)).toArray();

        int target = Integer.parseInt(input.substring(input.indexOf("target") + 8).trim());
        System.out.println(searchInsert(arr, target));


    }

    public static int searchInsert(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i] >= target){
                return i;
            }
        }

        return nums.length;
    }

}
