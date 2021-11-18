"""
https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
Author: Andrew Jarombek
Date: 11/18/2021
"""

from typing import List


def count_negatives(grid: List[List[int]]) -> int:
    count = 0

    row = len(grid) - 1
    while row >= 0 and grid[row][-1] < 0:
        col = len(grid[row]) - 1

        while col >= 0 and grid[row][col] < 0:
            count += 1
            col -= 1

        row -= 1

    return count
