"""
https://leetcode.com/problems/lucky-numbers-in-a-matrix/
Author: Andrew Jarombek
Date: 8/8/2022
"""

from typing import List


def lucky_numbers(matrix: List[List[int]]) -> List[int]:
    row_minimum = []
    column_maximum = []

    for row in matrix:
        row_minimum.append(min(row))

    for i in range(len(matrix[0])):
        max_val = 0

        for j in range(len(matrix)):
            max_val = max(max_val, matrix[j][i])

        column_maximum.append(max_val)

    result = []

    for rindex, row in enumerate(matrix):
        for cindex, col in enumerate(row):
            if col == row_minimum[rindex] and col == column_maximum[cindex]:
                result.append(col)

    return result


if __name__ == '__main__':
    assert lucky_numbers([[3, 7, 8], [9, 11, 13], [15, 16, 17]]) == [15]
