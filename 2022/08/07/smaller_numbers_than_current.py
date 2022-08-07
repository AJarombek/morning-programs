"""
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
Author: Andrew Jarombek
Date: 8/7/2022
"""

from typing import List


def smaller_numbers_than_current(nums: List[int]) -> List[int]:
    values = [0] * 101

    for num in nums:
        values[num] += 1

    total = 0
    for index, val in enumerate(values):
        values[index] = total
        total += val

    index = 0

    while index < len(nums):
        nums[index] = values[nums[index]]
        index += 1

    return nums


if __name__ == '__main__':
    assert smaller_numbers_than_current([6, 5, 4, 8]) == [2, 1, 0, 3]
    assert smaller_numbers_than_current([7, 7, 7, 7]) == [0, 0, 0, 0]
