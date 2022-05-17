"""
https://leetcode.com/problems/move-zeroes/
Author: Andrew Jarombek
Date: 5/16/2022
"""

from typing import List


def move_zeroes(nums: List[int]) -> None:
    slow = 0
    fast = 0

    while fast < len(nums):
        val = nums[fast]

        if val > 0:
            nums[slow] = val
            slow += 1

        fast += 1

    for i in range(slow, len(nums)):
        nums[i] = 0
