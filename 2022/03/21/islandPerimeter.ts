/**
 * https://leetcode.com/problems/island-perimeter/
 * @author Andrew Jarombek
 * @since 3/21/2022
 */

function islandPerimeter(grid: number[][]): number {
    let i = 0;
    let j = 0;
    let found = false;

    while (!found && i < grid.length) {
        while (!found && j < grid[0].length) {
            if (grid[i][j] == 1) {
                found = true;
                return searchIsland(grid, i, j);
            }

            j++;
        }

        i++;
        j = 0;
    }

    return 0;
}

function searchIsland(grid: number[][], i: number, j: number): number {
    let value = 0;
    grid[i][j] = 2;

    if (i != 0 && grid[i-1][j] == 1) {
        value += searchIsland(grid, i-1, j);
    } else if (i == 0 || grid[i-1][j] == 0) {
        value++;
    }

    if (i != grid.length - 1 && grid[i+1][j] == 1) {
        value += searchIsland(grid, i+1, j);
    } else if (i == grid.length - 1 || grid[i+1][j] == 0) {
        value++;
    }

    if (j != 0 && grid[i][j-1] == 1) {
        value += searchIsland(grid, i, j-1);
    } else if (j == 0 || grid[i][j-1] == 0) {
        value++;
    }

    if (j != grid[0].length - 1 && grid[i][j+1] == 1) {
        value += searchIsland(grid, i, j+1);
    } else if (j == grid[0].length - 1 || grid[i][j+1] == 0) {
        value++;
    }

    return value;
}