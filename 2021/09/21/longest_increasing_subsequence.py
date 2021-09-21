"""
https://leetcode.com/problems/longest-continuous-increasing-subsequence/
Author: Andrew Jarombek
Date: 9/21/2021
"""

from typing import List


def find_length_of_lcis(nums: List[int]) -> int:
    longest = 1
    previous = nums[0]
    streak = 1

    for i in range(1, len(nums)):
        if nums[i] > previous:
            streak += 1
        else:
            longest = max(longest, streak)
            streak = 1

        previous = nums[i]

    longest = max(longest, streak)

    return longest
