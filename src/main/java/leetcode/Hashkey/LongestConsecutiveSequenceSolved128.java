package leetcode.Hashkey;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//
//You must write an algorithm that runs in O(n) time.
//
//
//
//Example 1:
//
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//Example 2:
//
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9
//Example 3:
//
//Input: nums = [1,0,1,2]
//Output: 3
//
//
//Constraints:
//
//0 <= nums.length <= 105
//-109 <= nums[i] <= 109
public class LongestConsecutiveSequenceSolved128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array ");
        String input = sc.nextLine();

        int[] nums = Arrays.stream(input.substring(input.indexOf("[")+1, input.indexOf("]")).split(","))
                .filter(st-> !st.isEmpty()).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

        System.out.println(longestConsecutive(nums));

    }


    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            hm.put(nums[i], false);
        }

        for(int key : hm.keySet()){
            if(hm.containsKey(key - 1) == false){
                hm.put(key, true);
            }
        }

        int max = 0;
        for(int key : hm.keySet()){
            int k = 1;
            if(hm.get(key) == true){
                while(hm.containsKey(key+k) == true){
                    k++;
                }
            }

            max = Math.max(max, k);
        }

        return max;
    }


}
