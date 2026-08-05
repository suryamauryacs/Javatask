package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;
//Given a 2D integer array matrix, return the transpose of matrix.
//
//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//
//
//
//
//
//Example 1:
//
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
//Example 2:
//
//Input: matrix = [[1,2,3],[4,5,6]]
//Output: [[1,4],[2,5],[3,6]]


public class TransposeMatrix867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array : ");
        String str = sc.nextLine();

                // Extract matrix part
                String matrixPart = str.substring(str.indexOf("[["));

                // Remove outer brackets
                matrixPart = matrixPart.substring(2, matrixPart.length() - 2);

                // Split rows
                String[] rows = matrixPart.split("\\],\\[");

                int[][] matrix = new int[rows.length][];

                for (int i = 0; i < rows.length; i++) {
                    String[] nums = rows[i].split(",");
                    matrix[i] = new int[nums.length];

                    for (int j = 0; j < nums.length; j++) {
                        matrix[i][j] = Integer.parseInt(nums[j]);
                    }
                }

                // Print matrix
                for (int[] row : matrix) {
                    System.out.println(Arrays.toString(row));
                }

    }
}
