package leetcode.Searching.BinarySearch;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
//Hint
//Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
//
//[4,5,6,7,0,1,2] if it was rotated 4 times.
//[0,1,2,4,5,6,7] if it was rotated 7 times.
//Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//
//Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//
//You must write an algorithm that runs in O(log n) time.
//
//
//
//Example 1:
//
//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2]
//Output: 0
//Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
//Example 3:
//
//Input: nums = [11,13,15,17]
//Output: 11
//Explanation: The original array was [11,13,15,17] and it was rotated 4 times.


import java.util.Arrays;
import java.util.Scanner;

public class FindMinimuminRotatedSortedArray153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the INput:");
        String input = sc.nextLine();
//
//        String[] parts = input.split("\\*s*target*s\\=*s");
//
//        int[] arr = strTArr(parts[0].replace("nums","").replace("=","").trim());
//
//        int target = Integer.parseInt(parts[1].trim());




        int start = input.indexOf('[');
        int end = input.indexOf(']');

        String arrString = input.substring(start + 1, end);

        int[] nums = Arrays.stream(arrString.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();

        int target = Integer.parseInt(
                input.substring(input.indexOf("target") + 8).trim()
        );

        System.out.println(Arrays.toString(nums));
        System.out.println(target);
    }

    public static int[] strTArr(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\]()<>{}]","");

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();
    }
}
