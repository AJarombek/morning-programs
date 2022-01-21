"""
https://leetcode.com/problems/4sum/
Author: Andrew Jarombek
Date: 1/20/2022
"""

from typing import List


def four_sum(nums: List[int], target: int) -> List[List[int]]:
    if len(nums) < 4:
        return []

    nums.sort()
    result = set()

    for i, x in enumerate(nums):
        for j in range(i + 1, len(nums)):
            y = nums[j]
            t = target - x - y

            start = j + 1
            end = len(nums) - 1

            while start < end:
                s = nums[start]
                e = nums[end]

                if s + e == t:
                    result.add((x, y, s, e))
                    start += 1
                    end -= 1
                elif s + e < t:
                    start += 1
                else:
                    end -= 1

    return list(result)
