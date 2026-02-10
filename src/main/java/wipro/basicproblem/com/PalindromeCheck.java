package wipro.basicproblem.com;

public class PalindromeCheck {

    public static boolean isPalindrome(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static void main(String args[]){
        String str = "madam";

        System.out.println(isPalindrome(str));


    }
}
