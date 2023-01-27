"""
https://leetcode.com/problems/sort-colors/
Author: Andrew Jarombek
Date: 1/26/2023
"""

from typing import List


def sort_colors(nums: List[int]) -> None:
    index = 0
    ptr = 0

    while ptr < len(nums):
        val = nums[ptr]

        if val == 0:
            temp = nums[index]
            nums[index] = val
            nums[ptr] = temp
            index += 1

        ptr += 1

    ptr = index
    while ptr < len(nums):
        val = nums[ptr]

        if val == 1:
            temp = nums[index]
            nums[index] = val
            nums[ptr] = temp
            index += 1

        ptr += 1


if __name__ == '__main__':
    colors = [2, 0, 2, 1, 1, 0]
    sort_colors(colors)

    assert [0, 0, 1, 1, 2, 2]

    colors = [2, 0, 1]
    sort_colors(colors)

    assert [0, 1, 2]
