package leetcode.string.easy;
//  https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

//1704. Determine if String Halves Are Alike
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
//
//Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
//
//Return true if a and b are alike. Otherwise, return false.
//
//
//
//Example 1:
//
//Input: s = "book"
//Output: true
//Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
//Example 2:
//
//Input: s = "textbook"
//Output: false
//Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
//Notice that the vowel o is counted twice.
//
//
//Constraints:
//
//2 <= s.length <= 1000
//s.length is even.
//s consists of uppercase and lowercase letters.
//

import java.util.Scanner;

public class DetermineifStringHalvesAreAlike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = sc.nextLine();

        System.out.println(halvesAreAlike(str));

    }

    public static boolean halvesAreAlike(String s) {

        String vowels = "AEIOUaeiou";
        int mid = s.length()/2;
        int countA = 0, countB = 0;

        for(int i = 0;i<mid;i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                countA++;
            }

            if(vowels.indexOf(s.charAt(i+mid)) != -1){
                countB++;
            }
        }

        return countA == countB;
    }
}
