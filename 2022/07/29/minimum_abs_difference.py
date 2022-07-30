"""
https://leetcode.com/problems/minimum-absolute-difference/
Author: Andrew Jarombek
Date: 7/29/2022
"""

import math
from typing import List


def minimum_abs_difference(arr: List[int]) -> List[List[int]]:
    sorted_arr = sorted(arr)
    difference = math.inf

    for i in range(1, len(sorted_arr)):
        difference = min(difference, abs(sorted_arr[i] - sorted_arr[i - 1]))

    result = []

    for i in range(1, len(sorted_arr)):
        y = sorted_arr[i]
        x = sorted_arr[i - 1]

        if abs(y - x) == difference:
            result.append([x, y])

    return sorted(result, key=lambda a: a[0])


if __name__ == '__main__':
    assert minimum_abs_difference([4, 2, 1, 3]) == [[1, 2], [2, 3], [3, 4]]
