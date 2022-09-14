/**
 * https://leetcode.com/problems/reshape-the-matrix/
 * @author Andrew Jarombek
 * @since 9/13/2022
 */

const matrixReshape = function(mat, r, c) {
    const rows = mat.length;
    const cols = mat[0].length;

    if (r * c !== rows * cols)
        return mat;

    const result = [];
    let index = 0;

    for (let i = 0; i < r; i++) {
        const row = [];

        for (let j = 0; j < c; j++) {
            row.push(mat[Math.floor(index / cols)][index % cols]);
            index++;
        }

        result.push(row);
    }

    return result;
}

let result = matrixReshape([[1, 2], [3, 4]], 1, 4);
let expected = [[1, 2, 3, 4]]
console.assert(expected.every(
    (row, r) =>
        row.every((item, c) =>
            item === result[r][c])
));

result = matrixReshape([[1, 2], [3, 4]], 2, 4);
expected = [[1, 2], [3, 4]]
console.assert(expected.every(
    (row, r) =>
        row.every((item, c) =>
            item === result[r][c])
));
