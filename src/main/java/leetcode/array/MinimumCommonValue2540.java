package leetcode.array;
//Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
//
//Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

//https://leetcode.com/problems/minimum-common-value/description/
//Example 1:
//
//Input: nums1 = [1,2,3], nums2 = [2,4]
//Output: 2
//Explanation: The smallest element common to both arrays is 2, so we return 2.
//Example 2:
//
//Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
//Output: 2
//Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.

import java.util.Arrays;
import java.util.Scanner;

//  nums1 = [1,2,3], nums2 = [2,4]
//a = [1,2,3], b = [2,4]

public class MinimumCommonValue2540 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array like [1,2,3]:");
        String input = sc.nextLine();

        int[] arr1 = strToArrays(input, "nums1");

        int[] arr2 = strToArrays(input, "nums2");

        System.out.println("The array is arr1 " + Arrays.toString(arr1));
        System.out.println("The array is arr2 " + Arrays.toString(arr2));

        System.out.println(getCommon(arr1, arr2));


    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int i =0, j = 0;
        while(i< nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }

    public static int[] strToArrays(String s, String label) {
        int labelPos = s.indexOf(label);
        int eqpos = s.indexOf("=", labelPos);
        int lbPos = s.indexOf('[', eqpos);
        int rbPos = s.indexOf(']', eqpos + 1);

        String inside = s.substring(lbPos + 1, rbPos);
        if (inside.trim().isEmpty())
            return new int[0];

        return Arrays.stream(inside.split(","))
                .map(String::trim)
                .filter(st -> !st.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

    }



}
