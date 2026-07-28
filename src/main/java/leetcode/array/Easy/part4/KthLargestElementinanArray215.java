package leetcode.array.Easy.part4;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
//Given an integer array nums and an integer k, return the kth largest element in the array.
//
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
//
//Can you solve it without sorting?
//
//
//
//Example 1:
//
//Input: nums = [3,2,1,5,6,4], k = 2
//Output: 5
//Example 2:
//
//Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//Output: 4
//
//
//Constraints:
//
//1 <= k <= nums.length <= 105
//-104 <= nums[i] <= 104

public class KthLargestElementinanArray215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array and kth element : ");
        String input = sc.nextLine();

//        int[] arr = Arrays.stream(input.substring(input.indexOf("[") + 1, input.indexOf("]")). split(",")
//                .filter(st -> !st.isEmpty()).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

        int[] arr = Arrays.stream(input.substring(input.indexOf("[") + 1, input.indexOf("]")).split(","))
                .filter(s -> !s.isEmpty()).map(String::trim).mapToInt(Integer::parseInt).toArray();


        int k = Integer.parseInt(input.substring(input.indexOf("k")+4));
        System.out.println(Arrays.toString(arr));
        System.out.println(findKthLargest(arr, k));

    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>();

        for(int i = 0;i<nums.length;i++){

            if(pq.size() < k){
                pq.add(nums[i]);
            }else if(pq.peek() < nums[i]){
                pq.remove();
                pq.add(nums[i]);
            }
        }

        return pq.peek();
    }
}
