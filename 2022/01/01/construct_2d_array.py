"""
https://leetcode.com/problems/convert-1d-array-into-2d-array/
Author: Andrew Jarombek
Date: 1/1/2022
"""

from typing import List


def construct_2d_array(original: List[int], m: int, n: int) -> List[List[int]]:
    if len(original) != m * n:
        return []

    result = []

    for row in range(m):
        subarray = []

        for col in range(n):
            subarray.append(original[row * n + col])

        result.append(subarray)

    return result
