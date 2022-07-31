"""
https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
Author: Andrew Jarombek
Date: 7/31/2022
"""

from typing import List


def odd_cells(m: int, n: int, indices: List[List[int]]) -> int:
    rows = [0] * m
    cols = [0] * n

    for index in indices:
        rows[index[0]] += 1
        cols[index[1]] += 1

    result = 0

    for i in range(m):
        for j in range(n):
            if (rows[i] + cols[j]) % 2 == 1:
                result += 1

    return result


if __name__ == '__main__':
    assert odd_cells(2, 3, [[0, 1], [1, 1]]) == 6
