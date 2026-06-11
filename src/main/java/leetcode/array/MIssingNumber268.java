package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

//Input: nums = [0,1]
//
//Output: 2
//
//Explanation:
//
//n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.


//Input: nums = [9,6,4,2,3,5,7,0,1]
//
//Output: 8
//
//Explanation:
//
//n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.


public class MIssingNumber268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array like [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strtoArray(input);

        System.out.println(missingNumber(arr));

        System.out.println(missingNumberxor(arr));
    }

    public static int missingNumberxor(int[] arr){
        int xor = arr.length;

        for(int i = 0;i<arr.length;i++){
            xor = xor ^ i ^ arr[i];
        }

        return xor;
    }


    public static int missingNumber(int[] arr){
        long sum = 0, totalsum = 0;
        int n = arr.length;
        for(int i : arr){
            sum += i;
        }
        totalsum = (long)n *(n+1)/2;

        return (int) (totalsum - sum);


    }

    public static int[] strtoArray(String s){
        if(s == null)
            return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();



    }
}


//import java.util.Arrays;
//
//class Solution {
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != i) {
//                return i;
//            }
//        }
//        return nums.length;
//    }
//}

