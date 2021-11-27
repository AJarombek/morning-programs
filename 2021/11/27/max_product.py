"""
https://leetcode.com/problems/shuffle-the-array/
Author: Andrew Jarombek
Date: 11/27/2021
"""

from typing import List


def max_product(nums: List[int]) -> int:
    first = 0
    second = 0

    for num in nums:
        if num > first:
            second = first
            first = num
        elif num > second:
            second = num

    return (first - 1) * (second - 1)
