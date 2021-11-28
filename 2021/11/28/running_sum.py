"""
https://leetcode.com/problems/running-sum-of-1d-array/
Author: Andrew Jarombek
Date: 11/28/2021
"""

from typing import List


def running_sum(nums: List[int]) -> List[int]:
    for i in range(1, len(nums)):
        nums[i] = nums[i] + nums[i - 1]

    return nums
