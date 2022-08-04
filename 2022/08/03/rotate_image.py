"""
https://leetcode.com/problems/rotate-image/
Author: Andrew Jarombek
Date: 8/3/2022
"""

from typing import List


def rotate(matrix: List[List[int]]) -> None:
    """
    Do not return anything, modify matrix in-place instead.
    """
    for y in range(len(matrix) // 2):
        for x in range(y, len(matrix) - 1 - y):
            print(f"Loop: {y} {x}")
            temp = matrix[y][x]

            print(f"({len(matrix) - 1 - x}, {y})")
            matrix[y][x] = matrix[len(matrix) - 1 - x][y]

            print(f"({len(matrix) - 1 - y}, {len(matrix) - 1 - x})")
            matrix[len(matrix) - 1 - x][y] = matrix[len(matrix) - 1 - y][len(matrix) - 1 - x]

            print(f"({x}, {len(matrix) - 1 - y})")
            matrix[len(matrix) - 1 - y][len(matrix) - 1 - x] = matrix[x][len(matrix) - 1 - y]

            print(f"({y}, {x})")
            matrix[x][len(matrix) - 1 - y] = temp


if __name__ == '__main__':
    matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    rotate(matrix)

    assert matrix == [[7, 4, 1], [8, 5, 2], [9, 6, 3]]

    matrix = [
        [5, 1, 9, 11],
        [2, 4, 8, 10],
        [13, 3, 6, 7],
        [15, 14, 12, 16]
    ]
    rotate(matrix)

    assert matrix == [
        [15, 13, 2, 5],
        [14, 3, 4, 1],
        [12, 6, 8, 9],
        [16, 7, 10, 11]
    ]
