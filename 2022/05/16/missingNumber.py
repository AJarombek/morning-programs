"""
https://leetcode.com/problems/missing-number/
Author: Andrew Jarombek
Date: 5/16/2022
"""

from typing import List


def missing_number(nums: List[int]) -> int:
    unique_nums = set(nums)

    for i in range(0, len(nums) + 1):
        if i not in unique_nums:
            return i

    return -1
