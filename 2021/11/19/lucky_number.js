/**
 * https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 * @author Andrew Jarombek
 * @since 11/19/2021
 */

const luckyNumbers  = function(matrix) {
    const minCells = new Set();
    const result = [];

    for (let i = 0; i < matrix.length; i++) {
        const row = matrix[i];
        const min = row.reduce((acc, val, index) => val < acc[0] ? [val, index] : acc, [Infinity, -1]);
        minCells.add(`${i}:${min[1]}`);
    }

    for (let i = 0; i < matrix[0].length; i++) {
        let max = 0;
        let maxIndex = -1;

        for (let j = 0; j < matrix.length; j++) {
            if (matrix[j][i] > max) {
                max = matrix[j][i];
                maxIndex = j;
            }
        }

        if (minCells.has(`${maxIndex}:${i}`)) {
            result.push(matrix[maxIndex][i]);
        }
    }

    return result;
};