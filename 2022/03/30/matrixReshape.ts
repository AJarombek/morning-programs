/**
 * https://leetcode.com/problems/reshape-the-matrix/
 * @author Andrew Jarombek
 * @since 3/30/2022
 */

function matrixReshape(mat: number[][], r: number, c: number): number[][] {
    if (r * c != mat.length * mat[0].length) {
        return mat;
    }

    let result = [];
    let i = 0;
    let j = 0;

    for (let x = 0; x < r; x++) {
        result.push([]);

        for (let y = 0; y < c; y++) {
            result[x][y] = mat[i][j];

            if (j + 1 == mat[0].length) {
                i++;
                j = 0;
            } else {
                j++;
            }
        }
    }

    return result;
}