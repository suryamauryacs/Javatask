package com.wiproArray.com;
import java.util.*;

public class RotactArrayByOne {

    public static int[] RotactArr(int[] arr, int n ){

        int temp = arr[0];
        for(int i = 1;i<n;i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array:");
        String arrStr = sc.nextLine();

        int[] arr = Arrays.stream(arrStr.trim().split(" ")).mapToInt(Integer::parseInt).toArray();


        System.out.println(Arrays.toString(RotactArr(arr, arr.length)));


    }
}
