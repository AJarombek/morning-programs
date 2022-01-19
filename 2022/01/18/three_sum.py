"""
https://leetcode.com/problems/3sum/
Author: Andrew Jarombek
Date: 1/18/2022
"""

from typing import List


def three_sum(nums: List[int]) -> List[List[int]]:
    if len(nums) < 3:
        return []

    nums.sort()
    solutions = set()

    i = 0
    while i < len(nums) and nums[i] <= 0:
        start = i + 1
        end = len(nums) - 1

        while start < end:
            value = nums[i] + nums[start] + nums[end]

            if value == 0:
                solutions.add((nums[i], nums[start], nums[end]))
                start += 1
                end -= 1
            elif value < 0:
                start += 1
            else:
                end -= 1

        i += 1

    return list(solutions)


def three_sum_slow(nums: List[int]) -> List[List[int]]:
    nums.sort()
    result = set()

    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            for k in range(j + 1, len(nums)):
                x = nums[i]
                y = nums[j]
                z = nums[k]

                key = 0 - x - y

                if x + y + z == 0:
                    result.add((x, y, z))

    return list(result)
