"""
https://leetcode.com/problems/matrix-diagonal-sum/
Author: Andrew Jarombek
Date: 8/18/2022
"""

from typing import List


def diagonal_sum(mat: List[List[int]]) -> int:
    result = 0

    for i in range(len(mat)):
        result += mat[i][i]
        j = len(mat) - 1 - i

        if i != j:
            result += mat[i][j]

    return result


if __name__ == '__main__':
    assert diagonal_sum([[1, 2, 3], [4, 5, 6], [7, 8, 9]]) == 25
    assert diagonal_sum([[1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1]]) == 8
    assert diagonal_sum([[5]]) == 5
