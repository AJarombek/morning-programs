"""
https://leetcode.com/problems/transpose-matrix/
Author: Andrew Jarombek
Date: 10/10/2021
"""

from typing import List


def transpose(matrix: List[List[int]]) -> List[List[int]]:
    """
    # This only works if len(matrix) == len(matrix[0])
    for y in range(len(matrix)):
        for x in range(y, len(matrix[0])):
            temp = matrix[y][x]
            matrix[y][x] = matrix[x][y]
            matrix[x][y] = temp
    """

    y = len(matrix)
    x = len(matrix[0])

    t = []

    for i in range(x):
        row = []

        for j in range(y):
            row.append(matrix[j][i])

        t.append(row)

    return t


if __name__ == '__main__':
    assert transpose([[1, 2, 3], [4, 5, 6], [7, 8, 9]]) == [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
