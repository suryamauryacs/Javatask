package com.wiproArray.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {

    public static List<Integer> reverseArray(int[] arr, int n){
        List<Integer> lst = new ArrayList<Integer>();
        for(int i = n-1; i>=0;i--){
            lst.add(arr[i]);
        }

        return lst;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(reverseArray(arr, n));
    }
}
