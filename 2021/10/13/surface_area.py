"""
https://leetcode.com/problems/surface-area-of-3d-shapes/
Author: Andrew Jarombek
Date: 10/13/2021
"""

from typing import List


def surface_area(grid: List[List[int]]) -> int:
    area = 0

    for i in range(len(grid)):
        for j in range(len(grid[i])):
            height = grid[i][j]

            if height > 0:
                area += 2

                top = grid[i - 1][j] if i > 0 else 0
                bottom = grid[i + 1][j] if i < len(grid) - 1 else 0
                left = grid[i][j - 1] if j > 0 else 0
                right = grid[i][j + 1] if j < len(grid[i]) - 1 else 0

                area += max(height - top, 0)
                area += max(height - bottom, 0)
                area += max(height - left, 0)
                area += max(height - right, 0)

    return area
