"""
https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
Author: Andrew Jarombek
Date: 8/10/2022
"""

from typing import List


def min_start_value(nums: List[int]) -> int:
    low = 0
    current = 0

    for num in nums:
        current += num
        low = min(low, current)

    return abs(low) + 1


def min_start_value_faster(nums: List[int]) -> int:
    low = 0
    current = 0

    for num in nums:
        current += num
        low = min(low, current)

    return 1 - low


if __name__ == '__main__':
    nums = [-3, 2, -3, 4, 2]
    assert min_start_value(nums) == 5
    assert min_start_value_faster(nums) == 5
