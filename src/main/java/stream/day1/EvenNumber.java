package stream.day1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array like [1,2,4]:");
        String input = sc.nextLine();

        int[] arr = parsetoStringtoArray(input);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(evenNumber(arr)));
        System.out.println(evenNumbers(arr));

    }

    public static int[] evenNumber(int[] arr){

        int[] evens = Arrays.stream(arr)          // IntStream
                .filter(n -> n % 2 == 0)
                .toArray();

        return evens;
    }

    public static List<Integer> evenNumbers(int[] arr){

        List<Integer> evensList = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .boxed() // int -> Integer
                .collect(Collectors.toList());

        return evensList;

    }

    public static int[] parsetoStringtoArray(String s){
        if(s == null) return new int[0];

        s = s.trim();
        if(s.startsWith("[") && s.endsWith("]")){
            s = s.substring(1,s.length()-1);
        }

        if(s.trim().isEmpty()){
            return new int[0];
        }

        String[] pairs = s.split(",");
        int[] arr = new int[pairs.length];

        for(int i = 0;i<pairs.length;i++){
            arr[i] = Integer.parseInt(pairs[i]);
        }

        return arr;
    }

}
