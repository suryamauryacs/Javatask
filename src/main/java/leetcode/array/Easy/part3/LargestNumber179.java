package leetcode.array.Easy.part3;
//https://leetcode.com/problems/largest-number/description/

//Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
//
//Since the result may be very large, so you need to return a string instead of an integer.
//
//
//
//Example 1:
//
//Input: nums = [10,2]
//Output: "210"
//Example 2:
//
//Input: nums = [3,30,34,5,9]
//Output: "9534330"


import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array: ");
        String input = sc.nextLine();

        int[] arr = Arrays.stream(input.substring(input.indexOf("[") + 1, input.indexOf("]")).split(","))
                .filter(s -> !s.isEmpty()).map(String::trim).mapToInt(Integer::parseInt).toArray();

        System.out.println(largestNumber(arr));
    }
    public static String largestNumber(int[] nums) {

            String[] arr = new String[nums.length];

            for (int i = 0; i < nums.length; i++) {
                arr[i] = nums[i] + "";

            }

            Arrays.sort(arr, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));

            StringBuilder sb = new StringBuilder("");

            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i]);
            }

            return sb.charAt(0) == '0' ? "0" : sb.toString();
        }
}
