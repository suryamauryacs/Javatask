package leetcode.array.Easy.part2;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresofaSortedArray977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array like [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strToArr(input);
    }

    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];
        s = s.replaceAll("[\\[\\]<>\\(\\)\\{\\}]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();
    }
}
