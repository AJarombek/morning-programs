/**
 * https://leetcode.com/problems/shift-2d-grid/
 * @author Andrew Jarombek
 * @since 8/1/2022
 */

const shiftGrid = function(grid, k) {
    const values = [];
    const result = [];

    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[i].length; j++) {
            values.push(grid[i][j]);
        }
    }

    for (let i = 0; i < grid.length; i++) {
        const row = [];

        for (let j = 0; j < grid[i].length; j++) {
            let location = (j + (i * grid[i].length)) - k;
            let index = ((location % values.length) + values.length) % values.length;
            row.push(values[index]);
        }

        result.push(row);
    }

    return result;
}

const result = shiftGrid([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 1);
const expectedResult = [[9, 1, 2], [3, 4, 5], [6, 7, 8]]

console.assert(expectedResult.every(
    (row, i) => row.every(
        (value, j) => value ===result[i][j]
    )
));
