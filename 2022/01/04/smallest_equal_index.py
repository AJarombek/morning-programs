"""
https://leetcode.com/problems/smallest-index-with-equal-value/
Author: Andrew Jarombek
Date: 1/4/2022
"""

from typing import List


def smallest_equal(nums: List[int]) -> int:
    for index, num in enumerate(nums):
        if num % 10 == index % 10:
            return index

    return -1
