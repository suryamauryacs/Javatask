package Oops.Day1.test.Oops.Day2.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(45));
    }

    public static long factorial(long n){
        if(n == 1 || n == 0)
            return 1;
        return n * factorial(n-1);

    }
}
