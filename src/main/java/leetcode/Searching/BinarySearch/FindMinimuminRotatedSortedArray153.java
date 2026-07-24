package leetcode.Searching.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimuminRotatedSortedArray153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the INput:");
        String input = sc.nextLine();

        String[] parts = input.split("\\*s*target*s\\=*s");

        int[] arr = strTArr(parts[0].replace("nums","").replace("=","").trim());

        int target = Integer.parseInt(parts[1].trim());

        System.out.println(Arrays.toString(arr));
    }

    public static int[] strTArr(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\]()<>{}]","");

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();
    }
}
