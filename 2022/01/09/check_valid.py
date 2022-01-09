"""
https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/
Author: Andrew Jarombek
Date: 1/9/2022
"""

from typing import List


def check_valid(matrix: List[List[int]]) -> bool:
    integers = set(i + 1 for i in range(len(matrix)))

    for row in matrix:
        items = set()

        for item in row:
            items.add(item)

        if items != integers:
            return False

    for col in range(len(matrix)):
        items = set()

        for row in range(len(matrix)):
            item = matrix[row][col]
            items.add(item)

        if items != integers:
            return False

    return True
