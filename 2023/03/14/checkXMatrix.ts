/**
 * https://leetcode.com/problems/check-if-matrix-is-x-matrix/
 * @author Andrew Jarombek
 * @since 3/14/2023
 */

function checkXMatrix(grid: number[][]): boolean {
    for (let y = 0; y < grid.length; y++) {
        for (let x = 0; x < grid.length; x++) {
            if (y == x || y == grid.length - 1 - x) {
                if (grid[y][x] == 0) {
                    return false;
                }
            } else if (grid[y][x] != 0) {
                return false;
            }
        }
    }

    return true;
}
