package leetcode.array.Easy.part4;

import java.util.Arrays;
import java.util.Scanner;

public class BoatstoSavePeople881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array: ");

        String input = sc.nextLine();

        int[] arr = Arrays.stream(input.substring(input.indexOf("[") + 1, input.indexOf("]")).split(","))
                .filter(s -> !s.isEmpty()).map(String::trim).mapToInt(Integer::parseInt).toArray();



        System.out.println(Arrays.toString(arr));
        System.out.println(pivotIndex(arr));
    }


}
