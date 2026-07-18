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

        System.out.println(largestElement(arr));
    }

    public static int largestElement(int[] arr){
        int n= arr.length;
        int max = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }


    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];


        s = s.replaceAll("[\\[\\]<>\\(\\){}]","");
        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

    }
}
