package leetcode.array.matrix;
//https://leetcode.com/problems/search-a-2d-matrix/description/

//You are given an m x n integer matrix matrix with the following two properties:
//
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//
//You must write a solution in O(log(m * n)) time complexity.
//
//
//
//Example 1:
//
//
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
//Example 2:
//
//
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//Output: false
//
//
//Constraints:
//
//m == matrix.length
//n == matrix[i].length
//1 <= m, n <= 100
//-104 <= matrix[i][j], target <= 104


import java.util.Arrays;
import java.util.Scanner;

public class Searcha2DMatrix74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array of Matrix: ");
        String input = sc.nextLine();

//                String input = "matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3";

                // Split matrix and target
                String[] parts = input.split(", target = ");

                String matrixStr = parts[0].replace("matrix = ", "");
                int target = Integer.parseInt(parts[1]);

                // Convert matrix string to int[][]
                matrixStr = matrixStr.substring(2, matrixStr.length() - 2);
                String[] rows = matrixStr.split("\\],\\[");

                int[][] matrix = new int[rows.length][];

                for (int i = 0; i < rows.length; i++) {
                    String[] nums = rows[i].split(",");
                    matrix[i] = new int[nums.length];

                    for (int j = 0; j < nums.length; j++) {
                        matrix[i][j] = Integer.parseInt(nums[j]);
                    }
                }

                // Print matrix
                System.out.println("Matrix:");
                for (int[] row : matrix) {
                    System.out.println(Arrays.toString(row));
                }
                System.out.println("Target = " + target);

        System.out.println(searchMatrix(matrix, target));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int value = matrix[mid / n][mid % n];

            if (value == target) {
                return true;
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }


}
