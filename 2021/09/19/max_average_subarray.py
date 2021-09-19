"""
https://leetcode.com/problems/maximum-average-subarray-i/
Author: Andrew Jarombek
Date: 9/19/2021
"""

from typing import List


def find_max_average(nums: List[int], k: int) -> float:
    total = 0

    for i in range(k):
        total += nums[i]

    max_avg = total / k

    for i in range(k, len(nums)):
        total -= nums[i - k]
        total += nums[i]

        max_avg = max(max_avg, total / k)

    return max_avg
