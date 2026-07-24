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
        System.out.println("Enter the Input:");
        String input = sc.nextLine();

//
//        String[] parts = input.split("\\*s*target*s\\=*s");
//
//        int[] arr = strTArr(parts[0].replace("nums","").replace("=","").trim());
//
//        int target = Integer.parseInt(parts[1].trim());

        int[] arr = strTArr(input);

        System.out.println(findMin(arr));




    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        if(nums[start] <= nums[end]) {
            return nums[start];
        }

        while(start <= end){
            int mid = (start + end)/2;

            if(mid != 0 && nums[mid-1] > nums[mid]){
                return nums[mid];
            } else if(mid != nums.length -1 &&  nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }else if(nums[start] <= nums[mid]){//left part is sorted;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\](){}<>]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

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
