"""
https://leetcode.com/problems/3sum-closest
Author: Andrew Jarombek
Date: 1/19/2022
"""

import math
from typing import List


def three_sum_closest(nums: List[int], target: int) -> int:
    nums.sort()
    diff = math.inf
    result = 0

    for i, x in enumerate(nums):
        start = i + 1
        end = len(nums) - 1

        while start < end:
            y = nums[start]
            z = nums[end]
            value = x + y + z

            difference = abs(target - value)

            if difference < diff:
                diff = difference
                result = value

            if value == target:
                return value
            elif value < target:
                start += 1
            else:
                end -= 1

    return result


def three_sum_closest(nums: List[int], target: int) -> int:
    diff = math.inf
    result = 0

    for i, x in enumerate(nums):
        for j in range(i + 1, len(nums)):
            y = nums[j]

            for k in range(j + 1, len(nums)):
                z = nums[k]
                value = x + y + z
                difference = abs(target - value)

                if difference < diff:
                    diff = difference
                    result = value

                    if diff == 0:
                        return result

    return result
