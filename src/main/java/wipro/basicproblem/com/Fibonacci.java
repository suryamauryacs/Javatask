package wipro.basicproblem.com;
import java.util.*;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public static void printFibo(long n){
        List<Integer> lst = new ArrayList<Integer>();
        int a = 0, b = 1,c=0;

        if(n ==1) {
            lst.add(0);
        }
        else if(n==2){
            lst.add(0);
            lst.add(1);
        }
        else if(n>2){
            lst.add(a);
            lst.add(b);
            for(int i = 2;i<n;i++){

                c = a+b;
                a = b;
                b = c;

                lst.add(c);
            }
        }

        System.out.println(lst);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        printFibo(n);
    }
}
