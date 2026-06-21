package leetcode.array.Medium;
//88. Merge Sorted Array
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//
//
//
//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//Example 2:
//
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
//Example 3:
//
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray88 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ✅ read full line
        System.out.println("enter the aaray : ");
        String input = sc.nextLine();

        int[] nums1 = strToArrays(input, "nums1");
        int[] nums2 = strToArrays(input, "nums2");

        int m = extractInt(input, "m");
        int n = extractInt(input, "n");

        // ✅ printing to verify
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println("m = " + m + ", n = " + n);


        System.out.println(Arrays.toString(merge(nums1,m, nums2, n)));
    }


    public static int extractInt(String s, String label) {
        int labelPos = s.indexOf(label);
        int eqpos = s.indexOf("=", labelPos);

        int comma = s.indexOf(",", eqpos);
        if (comma == -1) comma = s.length();

        return Integer.parseInt(
                s.substring(eqpos + 1, comma).trim()
        );
    }


    public static int[] strToArrays(String s, String nums1){
        if(s == null)
            return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();



    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m + n - 1;

        while(j>=0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        return nums1;
    }

}
