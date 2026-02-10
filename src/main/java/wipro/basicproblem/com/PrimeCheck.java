package wipro.basicproblem.com;

import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(long n){
        for(int i = 2;i<= Math.sqrt(n)+1;i++){
            if(n%i ==0)
                return false;
        }

        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(isPrime(n));
    }
}
