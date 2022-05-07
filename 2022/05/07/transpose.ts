/**
 * https://leetcode.com/problems/transpose-matrix/
 * @author Andrew Jarombek
 * @since 5/7/2022
 */

function transpose(matrix: number[][]): number[][] {
    let result = [];

    for (let i = 0; i < matrix[0].length; i++) {
        let row = [];

        for (let j = 0; j < matrix.length; j++) {
            row.push(matrix[j][i]);
        }

        result.push(row);
    }

    return result;
}