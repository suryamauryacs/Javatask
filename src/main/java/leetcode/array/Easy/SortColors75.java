package leetcode.array.Easy;
//https://leetcode.com/problems/sort-colors/?envType=problem-list-v2&envId=array

//75. Sort Colors
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Hint
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
        System.out.println("Enter the Array like : [1,2,3}");
        String input = sc.nextLine();

        int[] arr = strToarr(input);

        System.out.println(Arrays.toString(sortColors(arr)));

    }

    public static int[] sortColors(int[] nums) {
        int n = nums.length;
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i =0;i<n;i++){
            if(nums[i] == 0)
                count0++;
            else if(nums[i] == 1){
                count1++;
            }
            else if(nums[i] == 2){
                count2++;
            }
        }
        int idx = 0;
        for(int i = 0;i<count0;i++){
            nums[idx++] = 0;
        }

        for(int i = 0;i<count1;i++){
            nums[idx++] = 1;
        }

        for(int i = 0;i<count2;i++){
            nums[idx++] = 2;
        }
        return nums;
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
