package leetcode.Searching.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SortColors75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Arrays like num = [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = Arrays.stream(
                        input.substring(input.indexOf('[') + 1, input.indexOf(']'))
                                .split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();


    }


    public static void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            } else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
}
