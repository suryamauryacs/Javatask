package leetcode.Logical.EasyProblme;
//https://leetcode.com/problems/add-to-array-form-of-integer/description/

//989. Add to Array-Form of Integer
//Easy
//Topics
//premium lock icon
//Companies
//The array-form of an integer num is an array representing its digits in left to right order.
//
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
//
//
//
//Example 1:
//
//Input: num = [1,2,0,0], k = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234
//Example 2:
//
//Input: num = [2,7,4], k = 181
//Output: [4,5,5]
//Explanation: 274 + 181 = 455
//Example 3:
//
//Input: num = [2,1,5], k = 806
//Output: [1,0,2,1]
//Explanation: 215 + 806 = 1021
//
//
//Constraints:
//
//1 <= num.length <= 104
//0 <= num[i] <= 9
//num does not contain any leading zeros except for the zero itself.
//1 <= k <= 104


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddtoArrayFormofInteger989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array like [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strToArr(input);
        System.out.println("Enter the K: for adding number:");
        int k = sc.nextInt();

        System.out.println(addToArrayForm(arr,k));

    }

    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];
        s = s.replaceAll("[\\[\\]<>(){}]","").trim();
//        s = s.replace("[","").replace("]","").replace("<","").replace(">","")
//                .replace("(","").replace(")","").replace("{","").replace("}","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

    }


    public static List<Integer> addToArrayForm(int[] num, int k) {
        long number = 0;
        for(int digit : num){
            number = number*10+ digit;

        }
        number += k;

        List<Integer> res = new ArrayList<>();

        while(number > 0){
            res.add(0, (int) (number%10));
            number /= 10;
        }

        return res;
    }
}
