"""
https://leetcode.com/problems/find-lucky-integer-in-an-array/
Author: Andrew Jarombek
Date: 11/22/2021
"""

from typing import List
import heapq


def min_subsequence(nums: List[int]) -> List[int]:
    right = sum(nums)
    left = 0

    heapq.heapify(nums)

    while len(nums) > 0 and right - nums[0] > left + nums[0]:
        value = heapq.heappop(nums)
        left += value
        right -= value

    result = [heapq.heappop(nums) for i in range(len(nums))]
    result.reverse()
    return result
