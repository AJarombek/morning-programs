"""
https://leetcode.com/problems/shift-2d-grid/
Author: Andrew Jarombek
Date: 11/12/2021
"""

from typing import List


def shift_grid(grid: List[List[int]], k: int) -> List[List[int]]:
    row = len(grid)
    col = len(grid[0])
    moves = k % (row * col)

    result = [[0 for c in range(col)] for r in range(row)]

    for r in range(row):
        for c in range(col):
            location = (r * col) + c
            source_location = (location - moves) % (row * col)
            source_row = source_location // col
            source_col = source_location % col
            result[r][c] = grid[source_row][source_col]

    return result


if __name__ == '__main__':
    assert shift_grid([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 1) == [[9, 1, 2], [3, 4, 5], [6, 7, 8]]
