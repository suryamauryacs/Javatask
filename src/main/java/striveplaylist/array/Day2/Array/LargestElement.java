package striveplaylist.array.Day2.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array like : [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strToArr(input);
        System.out.println(Arrays.toString(arr));

        System.out.println(checkArraySort(arr));
    }
}
