package wipro.basicproblem.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NRangePrimeNumber {

    public static void NPrimeNumber(long n){
        List<Integer> lst = new ArrayList<Integer>();

        int flag = 1;
        for(int i = 2;i<=n;i++){
            for(int j = 2;j<= Math.sqrt(i)+1;j++){
                if(i%j == 0){
                    flag=0;
                    break;
                }
                if(flag==1)
                    lst.add(i);
            }
        }

        System.out.println(lst);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        NPrimeNumber(n);
    }
}
