package leetcode.array.Easy.part2;

import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/squares-of-a-sorted-array/
//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//
//
//
//Example 1:
//
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
//Example 2:
//
//Input: nums = [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
//
//
//Constraints:
//
//1 <= nums.length <= 104
//-104 <= nums[i] <= 104
//nums is sorted in non-decreasing order.
//
//
//Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?

public class SquaresofaSortedArray977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array like [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strToArr(input);
        System.out.println(Arrays.toString(sortedSquares(arr)));
        System.out.println(Arrays.toString(sortedSquaresTwoPointer(arr)));

    }
    //Two pointer approach
    public int[] sortedSquaresTwoPointer(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length-1;

        int ptr = ans.length-1;

        while(start <= end){
            int ss = nums[start]*nums[start];
            int es = nums[end]*nums[end];

            if(ss> es){
                ans[ptr] = ss;
                start++;
            }else{
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }
        return ans;
    }


    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            res[i] = nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;
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
