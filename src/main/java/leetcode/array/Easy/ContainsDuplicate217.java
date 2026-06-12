package leetcode.array.Easy;
//217. Contains Duplicate
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//
//Output: true
//
//Explanation:
//
//The element 1 occurs at the indices 0 and 3.
//
//Example 2:
//
//Input: nums = [1,2,3,4]
//
//Output: false
//
//Explanation:
//
//All elements are distinct.
//
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//
//Output: true

//  https://leetcode.com/problems/contains-duplicate/description/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strtoArray(input);

        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicateotimal(arr));
    }

    public static int[] strtoArray(String s){
        if(s == null)
            return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();



    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        return nums.length == set.size() ? false : true;
    }

    public static boolean containsDuplicateotimal(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }

        return false;
    }
}
