package leetcode.challengelogical;
//https://leetcode.com/problems/water-bottles/description/
//
//Hint
//        There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.
//
//        The operation of drinking a full water bottle turns it into an empty bottle.
//
//        Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
//
//
//
//        Example 1:
//
//
//        Input: numBottles = 9, numExchange = 3
//        Output: 13
//        Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
//        Number of water bottles you can drink: 9 + 3 + 1 = 13.
//        Example 2:
//
//
//        Input: numBottles = 15, numExchange = 4
//        Output: 19
//        Explanation: You can exchange 4 empty bottles to get 1 full water bottle.
//        Number of water bottles you can drink: 15 + 3 + 1 = 19.

//
import java.sql.SQLOutput;
import java.util.Scanner;

public class WaterBottles1518 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: umBottles = 9, numExchange = 3");
        String input = sc.nextLine();
        String[] parts = input.split(",");
        int numBottles = Integer.parseInt(parts[0].split("=")[1].trim());
        int numExchnage = Integer.parseInt(parts[0].split("=")[1].trim());

        System.out.println(numWaterBottles(numBottles, numExchnage));
        System.out.println(numWaterBottlesS(numBottles, numExchnage));

    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int total =0;
        int empty = 0;
        while(numBottles >0){
            total += numBottles;
            empty += numBottles;
            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }
        return total;
    }

    public static int numWaterBottlesS(int numBottles, int numExchange)
    {
    return numBottles + (numBottles - 1) / (numExchange - 1);
    }


}
