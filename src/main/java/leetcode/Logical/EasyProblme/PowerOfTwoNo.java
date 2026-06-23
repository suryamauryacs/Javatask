package leetcode.Logical.EasyProblme;

import java.util.Scanner;

public class PowerOfTwoNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the NUMBER");
        int n = sc.nextInt();

        System.out.println(isPowerOfTwo(n));


    }

    public static boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }else if(n == 1){
            return true;
        }else{
            while(n%2 == 0){
                n = n/2;
            }

            if(n == 1)
                return true;
            else{
                return false;
            }
        }
    }

    public boolean isPowerOfTwos₹(int n) {
        return n > 0 && ( n & (n-1)) == 0;
    }

    public boolean isPowerOfTwoss(int n) {
        if(n == 1)
            return true;
        if(n <= 0 || n % 2 !=0)
            return false;
        return isPowerOfTwo(n/2);
    }

}
