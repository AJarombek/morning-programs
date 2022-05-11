/**
 * https://leetcode.com/problems/projection-area-of-3d-shapes/
 * @author Andrew Jarombek
 * @since 5/10/2022
 */

function projectionArea(grid: number[][]): number {
    let result = 0;
    let row = [];
    let col = [];

    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            let val = grid[i][j];

            if (val > 0) {
                result++;
            }

            row[i] = Math.max(row[i] ?? 0, val);
            col[j] = Math.max(col[j] ?? 0, val);
        }
    }

    result += row.reduce((acc, val) => acc + val);
    result += col.reduce((acc, val) => acc + val);
    return result;
}