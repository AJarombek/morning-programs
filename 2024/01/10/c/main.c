// Program: https://leetcode.com/problems/island-perimeter/
// Author: Andrew Jarombek
// Date: 1/10/2024

#include <assert.h>

int islandPerimeter(int** grid, int gridSize, const int* gridColSize) {
    int result = 0;

    for (int i = 0; i < gridSize; i++) {
        for (int j = 0; j < gridColSize[i]; j++) {
            if (grid[i][j] == 1) {
                if (i == 0 || grid[i-1][j] == 0) {
                    result++;
                }
                if (i == gridSize - 1 || grid[i+1][j] == 0) {
                    result++;
                }
                if (j == 0 || grid[i][j-1] == 0) {
                    result++;
                }
                if (j == gridColSize[i] - 1 || grid[i][j+1] == 0) {
                    result++;
                }
            }
        }
    }

    return result;
}

int main() {
    int grid[4][4] = {
        {0, 1, 0, 0},
        {1, 1, 1, 0},
        {0, 1, 0, 0},
        {1, 1, 0, 0}
    };

    int gridColSize[4] = {4, 4, 4, 4};

    int result = islandPerimeter(grid, 4, gridColSize);
    assert(result == 16);

    return 0;
}