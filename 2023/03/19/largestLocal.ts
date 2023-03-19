/**
 * https://leetcode.com/problems/largest-local-values-in-a-matrix/
 * @author Andrew Jarombek
 * @since 3/19/2023
 */

function largestLocal(grid: number[][]): number[][] {
    const result = [];

    for (let i = 0; i < grid.length - 2; i++) {
        const row = [];

        for (let j = 0; j < grid.length - 2; j++) {
            let value = 0;

            for (let x = i; x < i + 3; x++) {
                for (let y = j; y < j + 3; y++) {
                    value = Math.max(value, grid[x][y]);
                }
            }

            row.push(value);
        }

        result.push(row);
    }

    return result;
}