package striver.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strtoArray(input);

        System.out.println(Arrays.toString(selection_Sort(arr)));

    }

    public static int[] selection_Sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<=n-2;i++){
            int mini = i;
            for(int j = i;j<=n-1;j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }


    public static int[] strtoArray(String s){
        if(s == null)
            return new int[0];

        s = s.replace("[","").replace("]","").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();



    }


}
