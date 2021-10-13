"""
https://leetcode.com/problems/projection-area-of-3d-shapes/
Author: Andrew Jarombek
Date: 10/12/2021
"""

from typing import List


def projection_area(grid: List[List[int]]) -> int:
    total = 0

    for i in range(len(grid)):
        for j in range(len(grid[0])):
            if grid[i][j] > 0:
                total += 1

    for i in range(len(grid)):
        total += max(grid[i])

    for i in range(len(grid[0])):
        total += max([row[i] for row in grid])

    return total
