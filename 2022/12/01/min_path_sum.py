"""
https://leetcode.com/problems/minimum-path-sum/
Author: Andrew Jarombek
Date: 12/1/2022
"""

import math
from typing import List


def min_path_sum_v2(grid: List[List[int]]) -> int:
    m = len(grid)
    n = len(grid[0])

    for i in range(m):
        for j in range(n):
            if i == 0 and j == 0:
                continue
            elif i == 0:
                grid[i][j] += grid[i][j - 1]
            elif j == 0:
                grid[i][j] += grid[i - 1][j]
            else:
                grid[i][j] = min(grid[i][j] + grid[i][j - 1], grid[i][j] + grid[i - 1][j])

    return grid[-1][-1]


def min_path_sum(grid: List[List[int]]) -> int:
    m = len(grid)
    n = len(grid[0])
    paths = {(0, 0): grid[0][0]}
    result = math.inf

    while len(paths) > 0:
        new_paths = {}

        for (x, y), value in paths.items():
            if x == n - 1 and y == m - 1:
                result = min(result, value)
                continue

            if x + 1 < n:
                location = (x + 1, y)
                new_value = min(new_paths.get(location, math.inf), value + grid[y][x + 1])

                if new_value < result:
                    new_paths[location] = new_value
                else:
                    del new_paths[location]

            if y + 1 < m:
                location = (x, y + 1)
                new_value = min(new_paths.get(location, math.inf), value + grid[y + 1][x])

                if new_value < result:
                    new_paths[location] = new_value
                else:
                    del new_paths[location]

        paths = new_paths

    return result


if __name__ == '__main__':
    assert min_path_sum([[1, 3, 1], [1, 5, 1], [4, 2, 1]]) == 7
    assert min_path_sum_v2([[1, 3, 1], [1, 5, 1], [4, 2, 1]]) == 7

    assert min_path_sum([[1, 2, 3], [4, 5, 6]]) == 12
    assert min_path_sum_v2([[1, 2, 3], [4, 5, 6]]) == 12
