package striveplaylist.array.Day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LeftRotatation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]: ");
        String input = sc.nextLine();

        int[] arr = strToArr(input);

//        System.out.println(Arrays.toString(arr));
        int d = 20;
//        System.out.println(lefRotateArr(arr, d));
    }

//    public static int[] lefRotateArr(int[] arr, int d){
//
//    }


    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\]<>()]","");

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();


    }
}
















