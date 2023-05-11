/**
 * https://leetcode.com/problems/surface-area-of-3d-shapes/
 * @author Andrew Jarombek
 * @since 5/10/2023
 */

const assert = require('assert');

const surfaceArea = function(grid) {
    let result = 0;
    const n = grid.length;

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            const val = grid[i][j];

            if (val > 0) {
                result += 2;
            }

            const top = i === 0 ? 0 : grid[i-1][j];
            const left = j === 0 ? 0 : grid[i][j-1];
            const bottom = i === n-1 ? 0 : grid[i+1][j];
            const right = j === n-1 ? 0 : grid[i][j+1];

            result += Math.max(0, val - top);
            result += Math.max(0, val - left);
            result += Math.max(0, val - bottom);
            result += Math.max(0, val - right);
        }
    }

    return result;
}

// Test case 1: Regular grid
let grid1 = [
    [1, 2],
    [3, 4]
];
assert.strictEqual(surfaceArea(grid1), 34, 'Test case 1 failed');

// Test case 2: Grid with all zeros
let grid2 = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
];
assert.strictEqual(surfaceArea(grid2), 0, 'Test case 2 failed');
