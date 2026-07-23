package leetcode.array.Easy.part2;
//https://leetcode.com/problems/find-lucky-integer-in-an-array/description/
//Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
//
//Return the largest lucky integer in the array. If there is no lucky integer return -1.
//
//
//
//Example 1:
//
//Input: arr = [2,2,3,4]
//Output: 2
//Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
//Example 2:
//
//Input: arr = [1,2,2,3,3,3]
//Output: 3
//Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
//Example 3:
//
//Input: arr = [2,2,2,3,3]
//Output: -1
//Explanation: There are no lucky numbers in the array.
//

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FindLuckyIntegerinanArray1394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]");
        String input = sc.nextLine();
        int[] arr = strToArr(input);
        System.out.println(findLucky(arr));
    }

    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];
        s = s.replaceAll("[\\[\\]<>\\(\\)\\{\\}]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();
    }


    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int ele = arr[i];

            if(hm.containsKey(ele) == true){
                hm.put(ele, hm.get(ele) + 1);
            }else{
                hm.put(ele,1);
            }
        }

        int ans = -1;
        for(int key : hm.keySet()){
            if(hm.get(key) == key){
                ans = Math.max(ans, key);
            }
        }

        return  ans;
    }
}
