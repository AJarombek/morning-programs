"""
https://leetcode.com/problems/toeplitz-matrix/
Author: Andrew Jarombek
Date: 9/30/2021
"""

from typing import List


def is_toeplitz_matrix(matrix: List[List[int]]) -> bool:
    y = len(matrix)
    x = len(matrix[0])

    for i in range(len(matrix)):
        val = matrix[i][0]

        for j in range(1, min(y - i, x)):
            if matrix[i + j][j] != val:
                return False

    for j in range(1, len(matrix[0])):
        val = matrix[0][j]

        for i in range(1, min(y, x - j)):
            if matrix[i][j + i] != val:
                return False

    return True
