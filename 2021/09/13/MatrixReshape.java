/**
 * https://leetcode.com/problems/reshape-the-matrix/
 * @author Andrew Jarombek
 * @since 9/13/2021
 */

public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) {
            return mat;
        }

        int[][] newMat = new int[r][c];

        int row = 0;
        int col = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                newMat[row][col] = mat[i][j];

                if (col + 1 == c) {
                    row++;
                    col = 0;
                } else {
                    col++;
                }
            }
        }

        return newMat;
    }
}
