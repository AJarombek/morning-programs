/**
 * https://leetcode.com/problems/range-addition-ii/
 * @author Andrew Jarombek
 * @since 9/15/2021
 */

import java.util.Arrays;

public class RangeAddition {
    public int maxCountSlow(int m, int n, int[][] ops) {
        int[][] matrix = new int[m][n];

        for (int[] row : matrix) {
            Arrays.fill(row, 0);
        }

        for (int[] op : ops) {
            for (int i = 0; i < op[0]; i++) {
                for (int j = 0; j < op[1]; j++) {
                    matrix[i][j] = matrix[i][j] + 1;
                }
            }
        }

        int count = 0;
        int maxValue = 0;

        for (int[] row : matrix) {
            for (int cell : row) {
                if (cell > maxValue) {
                    count = 1;
                    maxValue = cell;
                } else if (cell == maxValue) {
                    count++;
                }
            }
        }

        return count;
    }

    public int maxCount(int m, int n, int[][] ops) {
        int x = m;
        int y = n;

        for (int[] op : ops) {
            x = Math.min(x, op[0]);
            y = Math.min(y, op[1]);
        }

        return x * y;
    }
}
