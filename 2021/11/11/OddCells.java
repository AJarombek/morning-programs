/**
 * https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 * @author Andrew Jarombek
 * @since 11/11/2021
 */

public class OddCells {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for (int[] location: indices) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[location[0]][i] += 1;
            }

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][location[1]] += 1;
            }
        }

        int count = 0;

        for (int[] row : matrix) {
            for (int cell : row) {
                if (cell % 2 == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}
