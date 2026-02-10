package com.ArrayBasic.Number;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Nubmer:");
        String input = sc.nextLine();

        int[] arr = StringtoArray(input);

        System.out.println(Arrays.toString(arr));

        int slargest = secondlargest(arr, arr.length);
        int ssmallest = secondSmallest(arr,arr.length);

      //  System.out.println(slargest+" "+ssmallest);

        System.out.println(checkArraySort(arr));

    }

    public static int[] StringtoArray(String s){
        if(s == null){
            return new int[0];
        }
        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty()){
            return new int[0];
        }

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }

    public static int secondlargest(int[] arr, int n){
        int largest = arr[0];
        int slargest = -1;
        for(int i = 1;i<n;i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i]> slargest){
                slargest = arr[i];
            }


        }
        return slargest;
    }

    public static int secondSmallest(int[] arr, int n){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i] < smallest){
                ssmallest = smallest;
                smallest = arr[i];

            }
            if(arr[i] != smallest && arr[i] < ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

    public static boolean checkArraySort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i] >= arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
}
