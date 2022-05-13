/**
 * https://leetcode.com/problems/surface-area-of-3d-shapes/
 * @author Andrew Jarombek
 * @since 5/12/2022
 */

function surfaceArea(grid: number[][]): number {
    let total = 0;

    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid.length; j++) {
            const val = grid[i][j];

            if (val > 0) {
                total += 2;
            }

            total += Math.max(0, val - (grid[i - 1] ? grid[i - 1][j] : 0));
            total += Math.max(0, val - (grid[i + 1] ? grid[i + 1][j] : 0));
            total += Math.max(0, val - (grid[i][j - 1] ?? 0));
            total += Math.max(0, val - (grid[i][j + 1] ?? 0));
        }
    }

    return total;
}