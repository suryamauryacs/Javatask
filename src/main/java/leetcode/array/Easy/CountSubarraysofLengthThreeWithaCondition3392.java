package leetcode.array.Easy;

//  https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/


//3392. Count Subarrays of Length Three With a Condition
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given an integer array nums, return the number of subarrays of length 3 such that the sum of the first and third numbers equals exactly half of the second number.
//
//
//
//Example 1:
//
//Input: nums = [1,2,1,4,1]
//
//Output: 1
//
//Explanation:
//
//Only the subarray [1,4,1] contains exactly 3 elements where the sum of the first and third numbers equals half the middle number.
//
//Example 2:
//
//Input: nums = [1,1,1]
//
//Output: 0
//
//Explanation:
//
//[1,1,1] is the only subarray of length 3. However, its first and third numbers do not add to half the middle number.
//
//
//
//Constraints:
//
//3 <= nums.length <= 100
//-100 <= nums[i] <= 100

import java.util.Arrays;
import java.util.Scanner;

public class CountSubarraysofLengthThreeWithaCondition3392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strtoArray(input);

        System.out.println(countSubarrays(arr));
//        System.out.println(containsDuplicateotimal(arr));
    }

    public static int[] strtoArray(String s){
        if(s == null)
            return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();



    }


    public static int countSubarrays(int[] nums) {
        int i=1, count = 0, curr = 0;
        int prev, next;

        while(i < nums.length - 1){
            prev = nums[i-1];
            curr = nums[i];
            next = nums[i+1];

            if(2*(prev + next) == curr){
                count++;
            }
            i++;
        }

        return count;
    }
}
