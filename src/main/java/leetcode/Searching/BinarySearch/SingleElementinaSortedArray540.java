package leetcode.Searching.BinarySearch;
//  https://leetcode.com/problems/single-element-in-a-sorted-array/description/
//You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
//
//Return the single element that appears only once.
//
//Your solution must run in O(log n) time and O(1) space.
//
//
//
//Example 1:
//
//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2
//Example 2:
//
//Input: nums = [3,3,7,7,10,11,11]
//Output: 10
//
//
//Constraints:
//
//1 <= nums.length <= 105
//0 <= nums[i] <= 105


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SingleElementinaSortedArray540 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array ");
        String input = sc.nextLine();
        int stps = input.indexOf("[");
        int endps = input.indexOf("]");
        String newString = input.substring(stps + 1, endps);

        int[] arr = Arrays.stream(newString.split(",")).filter(st -> ! st.isEmpty()).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

        System.out.println(Arrays.toString(arr));
    }


}
