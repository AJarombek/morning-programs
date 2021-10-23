"""
https://leetcode.com/problems/largest-perimeter-triangle/
Author: Andrew Jarombek
Date: 10/22/2021
"""

from typing import List


def largest_perimeter(nums: List[int]) -> int:
    sorted_nums = sorted(nums, reverse=True)

    index = 0

    while index + 2 < len(sorted_nums):
        if sorted_nums[index] < sorted_nums[index + 1] + sorted_nums[index + 2]:
            return sum(sorted_nums[index:index + 3])

        index += 1

    return 0
