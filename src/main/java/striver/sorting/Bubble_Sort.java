package striver.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strtoArray(input);

        System.out.println(Arrays.toString(bubble_Sort(arr)));

    }

    public static int[] bubble_Sort(int[] arr){
        int n = arr.length;
        for(int i = n-1; i>=1;i--){
            for(int j = 0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

//    [11,29,12,09,78,23,125,678,23423,535,235]

    public static int[] strtoArray(String s){
        if(s == null)
            return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();



    }




}
