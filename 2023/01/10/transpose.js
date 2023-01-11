/**
 * https://leetcode.com/problems/transpose-matrix/
 * @author Andrew Jarombek
 * @since 1/10/2023
 */

const transpose = function(matrix) {
    const result = [];

    for (let i = 0; i < matrix[0].length; i++) {
        const row = [];

        for (let j = 0; j < matrix.length; j++) {
            row.push(matrix[j][i]);
        }

        result.push(row);
    }

    return result;
}

let expected = [[1,4,7],[2,5,8],[3,6,9]];
let result = transpose([[1,2,3],[4,5,6],[7,8,9]]);

console.assert(result.every((list, i) => list.every((value, j) => value === expected[i][j])));
