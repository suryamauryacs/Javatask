package leetcode.array.Easy.part4;
//Companies
//Hint
//Given an array of integers nums, calculate the pivot index of this array.
//
//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
//
//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//
//Return the leftmost pivot index. If no such index exists, return -1.
//
//
//
//Example 1:
//
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11
//Example 2:
//
//Input: nums = [1,2,3]
//Output: -1
//Explanation:
//There is no index that satisfies the conditions in the problem statement.
//Example 3:
//
//Input: nums = [2,1,-1]
//Output: 0
//Explanation:
//The pivot index is 0.
//Left sum = 0 (no elements to the left of index 0)
//Right sum = nums[1] + nums[2] = 1 + -1 = 0


import java.util.Arrays;
import java.util.Scanner;

public class FindPivotIndex724 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array: ");

        String input = sc.nextLine();

        int[] arr = Arrays.stream(input.substring(input.indexOf("[") + 1, input.indexOf("]")).split(","))
                .filter(s -> !s.isEmpty()).map(String::trim).mapToInt(Integer::parseInt).toArray();



        System.out.println(Arrays.toString(arr));
        System.out.println(pivotIndex(arr));
    }


    public static int pivotIndex(int[] nums) {
        int rsum = 0;
        for(int ele : nums){
            rsum += ele;
        }

        int lsum = 0;

        for(int i = 0;i<nums.length; i++){
            rsum -= nums[i];

            if(rsum == lsum){
                return i;
            }

            lsum += nums[i];
        }

        return -1;
    }



}
