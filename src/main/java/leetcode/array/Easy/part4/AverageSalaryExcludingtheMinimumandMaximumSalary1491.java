package leetcode.array.Easy.part4;

//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/


//You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
//
//Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
//
//
//
//Example 1:
//
//Input: salary = [4000,3000,1000,2000]
//Output: 2500.00000
//Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
//Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
//Example 2:
//
//Input: salary = [1000,2000,3000]
//Output: 2000.00000
//Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
//Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
//
//
//Constraints:
//
//3 <= salary.length <= 100
//1000 <= salary[i] <= 106
//All the integers of salary are unique.

import java.util.Arrays;
import java.util.Scanner;

public class AverageSalaryExcludingtheMinimumandMaximumSalary1491 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        String input = sc.nextLine();

        int[] salary = Arrays.stream(input.substring(input.indexOf("[") +1, input.indexOf("]")).split(","))
                .filter(s -> !s.isEmpty()).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int sum = salary[0];

        for(int i = 1;i<salary.length;i++){
            if(max < salary[i]){
                max = salary[i];
            }

            if(min > salary[i]){
                min = salary[i];
            }

            sum += salary[i];
        }

        return (double) (sum - max - min) / (salary.length - 2);
    }
}
