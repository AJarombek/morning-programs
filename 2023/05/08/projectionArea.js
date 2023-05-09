/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * @author Andrew Jarombek
 * @since 5/7/2023
 */

const assert = require('assert');

const projectionArea = function(grid) {
    let result = 0;
    let rows = Array.from(Array(grid.length), () => 0);
    let cols = Array.from(Array(grid[0].length), () => 0);

    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            const val = grid[i][j];

            if (val > 0) {
                result++;
            }

            if (val > rows[i]) {
                rows[i] = val;
            }

            if (val > cols[j]) {
                cols[j] = val;
            }
        }
    }

    return (
        result +
        rows.reduce((acc, val) => acc + val) +
        cols.reduce((acc, val) => acc + val)
    );
};

// Test case 1: Regular grid
let grid1 = [
    [1, 2],
    [3, 4]
];
assert.strictEqual(projectionArea(grid1), 17, 'Test case 1 failed');

// Test case 3: Grid with all zeros
let grid3 = [
    [0, 0, 0],
    [0, 0, 0]
];
assert.strictEqual(projectionArea(grid3), 0, 'Test case 3 failed');
