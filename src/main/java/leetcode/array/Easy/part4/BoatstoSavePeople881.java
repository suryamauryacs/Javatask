package leetcode.array.Easy.part4;

import java.util.Arrays;
import java.util.Scanner;

////        https://leetcode.com/problems/boats-to-save-people/description/
//You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
//
//        Return the minimum number of boats to carry every given person.
//
//
//
//        Example 1:
//
//        Input: people = [1,2], limit = 3
//        Output: 1
//        Explanation: 1 boat (1, 2)
//        Example 2:
//
//        Input: people = [3,2,2,1], limit = 3
//        Output: 3
//        Explanation: 3 boats (1, 2), (2) and (3)
//        Example 3:
//
//        Input: people = [3,5,3,4], limit = 5
//        Output: 4
//        Explanation: 4 boats (3), (3), (4), (5)

//

public class BoatstoSavePeople881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array: ");

        String input = sc.nextLine();

        int[] arr = Arrays.stream(input.substring(input.indexOf("[") + 1, input.indexOf("]")).split(","))
                .filter(s -> !s.isEmpty()).map(String::trim).mapToInt(Integer::parseInt).toArray();

        int limit = Integer.parseInt(input.substring(input.indexOf("limit")+8));

        System.out.println(limit);
        System.out.println(Arrays.toString(arr));
        System.out.println(numRescueBoats(arr, limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int start = 0;
        int end = people.length - 1;

        int count = 0;



        while(start <= end){
            if(people[start] + people[end] <= limit){
                start++;
                end--;
            }else{
                end--;
            }

            count++;
        }

        return count++;
    }
}
