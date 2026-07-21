package leetcode.array.Easy.part2;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberAtLeastTwiceofOthers747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]");
        String input = sc.nextLine();
        int[] arr = strToArr(input);
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }
}
