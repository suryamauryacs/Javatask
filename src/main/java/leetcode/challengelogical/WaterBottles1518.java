package leetcode.challengelogical;
//https://leetcode.com/problems/water-bottles/description/

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
