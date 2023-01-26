"""
https://leetcode.com/problems/set-matrix-zeroes/
Author: Andrew Jarombek
Date: 1/25/2023
"""

from typing import List


def set_zeroes(matrix: List[List[int]]) -> None:
    swapped = [[0] * len(matrix[0]) for row in matrix]

    for r, row in enumerate(matrix):
        for c, col in enumerate(row):
            if swapped[r][c] == 0 and matrix[r][c] == 0:
                for i in range(r - 1, -1, -1):
                    matrix[i][c] = 0

                for i in range(r + 1, len(matrix)):
                    if matrix[i][c] != 0:
                        swapped[i][c] = 1

                    matrix[i][c] = 0

                for i in range(c - 1, -1, -1):
                    matrix[r][i] = 0

                for i in range(c + 1, len(matrix[0])):
                    if matrix[r][i] != 0:
                        swapped[r][i] = 1

                    matrix[r][i] = 0


if __name__ == '__main__':
    matrix = [[1, 1, 1], [1, 0, 1], [1, 1, 1]]
    set_zeroes(matrix)
    assert matrix == [[1, 0, 1], [0, 0, 0], [1, 0, 1]]
