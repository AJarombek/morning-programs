"""
https://leetcode.com/problems/largest-number-at-least-twice-of-others/
Author: Andrew Jarombek
Date: 9/27/2021
"""

from typing import List


def dominant_index(nums: List[int]) -> int:
    if len(nums) == 1:
        return 0

    second_largest = 0
    largest = 0
    largest_index = 0

    for index, num in enumerate(nums):
        if num >= largest:
            largest_index = index
            second_largest = largest
            largest = num
        elif num > second_largest:
            second_largest = num

    return largest_index if largest >= second_largest * 2 else -1
