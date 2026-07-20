package leetcode.array.Hard;

import java.util.Arrays;
import java.util.Scanner;
////https://leetcode.com/problems/median-of-two-sorted-arrays/description/
////4. Median of Two Sorted Arrays
////Solved
////Hard
////Topics
////premium lock icon
////Companies
////Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
////
////The overall run time complexity should be O(log (m+n)).
////
////
////
////Example 1:
////
////Input: nums1 = [1,3], nums2 = [2]
////Output: 2.00000
////Explanation: merged array = [1,2,3] and median is 2.
////Example 2:
////
////Input: nums1 = [1,2], nums2 = [3,4]
////Output: 2.50000
////Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
///
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 = [1,2], num2 = [3,4]:");
        String input = sc.nextLine();

        int[] arr1 = strToArr(input, "nums1");
        int[] arr2 = strToArr(input, "nums2");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(findMedianSortedArrays(arr1, arr2));

    }

    public static int[] strToArr(String s, String label){
        int nopos = s.indexOf(label);
        int eqpos = s.indexOf("=",nopos);
        int obpos = s.indexOf("[",eqpos);
        int cbpos = s.indexOf("]",obpos);

        String newStr = s.substring(obpos+1, cbpos);
        return Arrays.stream(newStr.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();
    }

    public static double findMedianSortedArrays(int[] arr1, int[] arr2){
        int total = arr1.length + arr2.length;
        int i = 0;
        int j  = 0;
        int curr = 0;
        int prev = 0;
        int mid1 = (total-1)/2;
        int mid2 = (total)/2;

        for(int count= 0;count<=mid2;count++){
            prev = curr;
            if(i < arr1.length && ( j< arr2.length || arr1[i] < arr2[j])){
                curr = arr1[i++];
            }else{
                curr = arr2[j++];
            }
        }

        if(total % 2 == 0){
            return (prev+curr)/2.0;
        }

        return curr;
    }
}
