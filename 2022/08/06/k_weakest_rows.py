"""
https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
Author: Andrew Jarombek
Date: 8/6/2022
"""

from typing import List


def k_weakest_rows(mat: List[List[int]], k: int) -> List[int]:
    values = []

    for index, row in enumerate(mat):
        ones = 0
        i = 0

        while i < len(row) and row[i] == 1:
            ones += 1
            i += 1

        values.append((ones, index))

    sorted_values = sorted(values)

    result = []

    for i in range(k):
        result.append(sorted_values[i][1])

    return result


if __name__ == '__main__':
    assert k_weakest_rows([
        [1, 1, 0, 0, 0],
        [1, 1, 1, 1, 0],
        [1, 0, 0, 0, 0],
        [1, 1, 0, 0, 0],
        [1, 1, 1, 1, 1]],
        3
    ) == [2, 0, 3]
