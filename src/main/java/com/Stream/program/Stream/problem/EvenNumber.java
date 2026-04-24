package com.Stream.program.Stream.problem;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter the the Aarray: like [1,2,3]: ");
        String input = sc.nextLine();

        int[] arr = strToArray(input);

        System.out.println(evenNumbers(arr));

    }

    public static List<Integer> evenNumbers(int[] arr){
        return Arrays.stream(arr).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
    }

    public static int[] strToArray(String s){
        if(s == null)
            return new int[0];
        s = s.replace("[","").replace("]","").trim();
        if(s.isEmpty())
            return new int[0];
        return Arrays.stream(s.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();


    }
}
