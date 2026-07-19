package leetcode.array.Hard;
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
//4. Median of Two Sorted Arrays
//Solved
//Hard
//Topics
//premium lock icon
//Companies
//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//The overall run time complexity should be O(log (m+n)).
//
//
//
//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//Example 2:
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MedianofTwoSortedArrays4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 = [1,2], num2 = [3,4]:");
        String input = sc.nextLine();

        int[] arr1 = strToArr(input, "num1");
        int[] arr2 = strToArr(input, "num2");

        System.out.println(Arrays.toString(arr1));
    }

    public static int[] strToArr(String s, String label){
        int numpos = s.indexOf(label);
        int eqpos = s.indexOf("=",numpos);
        int obpos = s.indexOf("[",eqpos);
        int cbpos = s.indexOf("]");

        s = s.substring(obpos+1,cbpos);

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1, nums2);
        double res = 0.0;
        if(ans.length % 2 == 0){

            res = (ans[ans.length/2] + ans[ans.length/2 - 1]) / 2.0;
        }else{
            res = ans[ans.length / 2];

        }
        return res;

    }

    public int[] merge(int[] num1, int[] num2){
        int[] ans = new int[num1.length + num2.length];
        int p1= 0;
        int p2= 0;
        int p3= 0;

        while(p1< num1.length || p2<num2.length){
            int val1 = p1<num1.length ? num1[p1] : Integer.MAX_VALUE;
            int val2 = p2<num2.length ? num2[p2] : Integer.MAX_VALUE;

            if(val1< val2){
                ans[p3] = val1;
                p1++;
            }else{
                ans[p3] = val2;
                p2++;
            }
            p3++;
        }
        return ans;
    }
}
