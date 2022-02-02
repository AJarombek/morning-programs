"""
https://leetcode.com/problems/next-permutation/
Author: Andrew Jarombek
Date: 2/1/2022
"""

from typing import List


def next_permutation(nums: List[int]) -> None:
    k = -1

    for i in range(len(nums) - 2, -1, -1):
        if nums[i] < nums[i + 1]:
            k = i
            break

    if k == -1:
        nums.reverse()
        return

    l = 0

    for i in range(len(nums) - 1, k, -1):
        if nums[k] < nums[i]:
            l = i
            break

    temp = nums[l]
    nums[l] = nums[k]
    nums[k] = temp

    start = k + 1
    end = len(nums) - 1

    while start < end:
        temp = nums[end]
        nums[end] = nums[start]
        nums[start] = temp
        start += 1
        end -= 1
