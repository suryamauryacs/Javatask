package leetcode.array.Easy.part2;

import java.util.Scanner;

//https://leetcode.com/problems/maximum-ascending-subarray-sum/description/
public class MaximumAscendingSubarraySum1800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]");
        String input = sc.nextLine();
        int[] arr = strToArr(input);
        System.out.println(dominantIndex(arr));

    }


}
