/**
 * https://leetcode.com/problems/flipping-an-image/
 * @author Andrew Jarombek
 * @since 1/7/2023
 */

const flipAndInvertImage = function(image) {
    const result = [];
    const n = image.length;

    for (let i = 0; i < n; i++) {
        const row = [];

        for (let j = 0; j < n; j++) {
            row.push(1 - image[i][n - j - 1]);
        }

        result.push(row);
    }

    return result;
}

let expected = [[1,0,0],[0,1,0],[1,1,1]];
let result = flipAndInvertImage([[1,1,0],[1,0,1],[0,0,0]]);

console.assert(result.every((list, i) => list.every((value, j) => value === expected[i][j])));
