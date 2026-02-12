package com.PrepBasic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number :");
        int num = sc.nextInt();

        System.out.println("The prime number is "+ checkprim(num));
    }

    public static boolean checkprim(int num){
       if(num <=1)
           return false;
       if(num == 2)
           return true;
       for(int i = 3;i*i <num;i+=2){
           if(num%i ==0)
               return false;
       }

       return true;
    }

//    public static boolean checkprim(int num){
//        if(num <=1){
//            return false;
//        }
//
//        for(int i = 2;i*i<=num;i++){
//            if(num%i == 0)
//                return false;
//        }
//
//        return true;
//    }

//    public static boolean checkprim(int num){
//        if(num <=1)
//            return false;
//        for (int i = 2;i<num;i++){
//            if(num %i == 0)
//                return false;
//
//        }
//
//        return true;
//    }
}
