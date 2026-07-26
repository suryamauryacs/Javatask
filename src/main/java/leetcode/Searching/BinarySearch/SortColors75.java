package leetcode.Searching.BinarySearch;

//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//
//You must solve this problem without using the library's sort function.
//
//
//
//Example 1:
//
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//Example 2:
//
//Input: nums = [2,0,1]
//Output: [0,1,2]
//
//
//Constraints:
//
//n == nums.length
//1 <= n <= 300
//nums[i] is either 0, 1, or 2.


import java.util.Arrays;
import java.util.Scanner;

public class SortColors75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Arrays like num = [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = Arrays.stream(
                        input.substring(input.indexOf('[') + 1, input.indexOf(']'))
                                .split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortColors(arr)));

    }


    public static void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    public static int[] sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            } else{
                swap(nums, mid, high);
                high--;
            }
        }

        return nums;
    }
}
