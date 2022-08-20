"""
https://leetcode.com/problems/special-positions-in-a-binary-matrix/
Author: Andrew Jarombek
Date: 8/20/2022
"""

from typing import List


def num_special(mat: List[List[int]]) -> int:
    row_sums = []

    for row in mat:
        row_sums.append(sum(row))

    result = 0

    for c in range(len(mat[0])):
        col_sum = 0
        to_add = 0

        for r in range(len(mat)):
            val = mat[r][c]
            col_sum += val

            if val == 1 and row_sums[r] == 1:
                to_add += 1

        if col_sum == 1:
            result += to_add

    return result


if __name__ == '__main__':
    assert num_special([[1, 0, 0], [0, 0, 1], [1, 0, 0]]) == 1
    assert num_special([[1, 0, 0], [0, 1, 0], [0, 0, 1]]) == 3
