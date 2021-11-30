"""
https://leetcode.com/problems/kth-missing-positive-number/
Author: Andrew Jarombek
Date: 11/30/2021
"""

from typing import List


def find_kth_positive(arr: List[int], k: int) -> int:
    result = k
    index = 0

    while index < len(arr) and arr[index] <= result:
        result += 1
        index += 1

    return result
