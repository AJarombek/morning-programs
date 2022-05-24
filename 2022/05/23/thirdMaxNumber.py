"""
https://leetcode.com/problems/third-maximum-number/
Author: Andrew Jarombek
Date: 5/23/2022
"""

from typing import List


def third_max(nums: List[int]) -> int:
    sorted_nums = sorted(set(nums), reverse=True)

    if len(sorted_nums) < 3:
        return sorted_nums[0]

    return sorted_nums[2]
