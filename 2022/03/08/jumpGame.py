"""
https://leetcode.com/problems/jump-game-ii/
Author: Andrew Jarombek
Date: 3/8/2022
"""

from typing import List


def jump(nums: List[int]) -> int:
    if len(nums) < 3:
        return len(nums) - 1

    result = 1
    start = 1
    end = nums[0]

    while end < len(nums) - 1:
        result += 1
        last = end + 1

        for i in range(start, end + 1):
            last = max(last, i + nums[i])

        start = end + 1
        end = last

    return result
