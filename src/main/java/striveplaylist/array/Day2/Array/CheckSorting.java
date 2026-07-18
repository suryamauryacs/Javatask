package striveplaylist.array.Day2.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array like : [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strToArr(input);
        System.out.println(Arrays.toString(arr));

        System.out.println(checkArraySort(arr));
    }

    public static boolean checkArraySort(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            if(arr[i] > arr[i-1]){

            }else{
                return false;
            }

        }
        return true;
    }

    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];

//        s = s.replaceAll("[\\[\\]<>[\\<>()\\]","");

//        s = s.replaceAll("[\\[\\]<>\\(\\){}]", "");
        s = s.replaceAll("[\\[\\]<>\\(\\){}]","");

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

    }
}
