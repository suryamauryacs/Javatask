package wipro.basicproblem.com;
import java.util.*;

public class SumOfDigit {

    public static long sumDigit(String n){

        int num = Integer.parseInt(n);
        int sum = 0;
        while(num !=0){
            sum += num %10;
            num /= 10;
        }

        return sum;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       // long num = sc.nextLong();

        String str = sc.nextLine();

        System.out.println(sumDigit(str));
    }
}
