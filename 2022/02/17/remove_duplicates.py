"""
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Author: Andrew Jarombek
Date: 2/17/2022
"""

from typing import List


def remove_duplicates(nums: List[int]) -> int:
    prev = -101
    end = 0

    for index, num in enumerate(nums):
        if num != prev:
            prev = num
            nums[end] = num
            end += 1

    return end
