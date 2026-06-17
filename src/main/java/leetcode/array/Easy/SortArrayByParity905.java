package leetcode.array.Easy;

//https://leetcode.com/problems/sort-array-by-parity/description/


//905. Sort Array By Parity
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//
//Return any array that satisfies this condition.
//
//
//
//Example 1:
//
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//Example 2:
//
//Input: nums = [0]
//Output: [0]
//
//
//Constraints:
//
//1 <= nums.length <= 5000
//0 <= nums[i] <= 5000


import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByParity905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array like : [1,2,3}");
        String input = sc.nextLine();

        int[] arr = strToarr(input);

        System.out.println(Arrays.toString(sortArrayByParity(arr)));


    }

    public static int[] sortArrayByParity(int[] arr){
        int i = 0, j = 0, temp = 0;

        while(i != arr.length && j != arr.length){
            if(arr[i] % 2 == 0){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            i++;
        }

        return arr;
    }

    public static int[] strToarr(String s){
        if(s == null)
            return new int[0];

//        s = s.replaceAll("[\\[\\]<>(){}","");
        s = s.replace("[","").replace("]","").trim();


        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();



    }

}
