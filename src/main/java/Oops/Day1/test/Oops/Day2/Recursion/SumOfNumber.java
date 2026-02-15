package Oops.Day1.test.Oops.Day2.Recursion;

public class SumOfNumber {
    public static void main(String[] args) {
//        System.out.println(sumOfNNaturalNumber(823));
    }

    public static long sumOfNNaturalNumber(long n){
        if(n == 1){
            return 1;
        }

        return n + sumOfNNaturalNumber(n-1);

    }
}
