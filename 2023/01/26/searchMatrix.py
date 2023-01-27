"""
https://leetcode.com/problems/search-a-2d-matrix/
Author: Andrew Jarombek
Date: 1/26/2023
"""

from typing import List


def search_matrix(matrix: List[List[int]], target: int) -> bool:
    y = len(matrix)
    x = len(matrix[0])

    low = 0
    high = y * x - 1

    while low <= high:
        mid = (low + high) // 2
        val = matrix[mid // x][mid % x]

        if val == target:
            return True

        if val > target:
            high = mid - 1
        else:
            low = mid + 1

    return False


if __name__ == '__main__':
    assert search_matrix([[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]], 3)
    assert not search_matrix([[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]], 13)
