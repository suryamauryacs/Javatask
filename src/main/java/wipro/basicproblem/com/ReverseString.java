package wipro.basicproblem.com;

public class ReverseString {
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String args[]){
        String str = "surya";

        System.out.println(reverse(str));


    }
}
