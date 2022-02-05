"""
https://leetcode.com/problems/search-in-rotated-sorted-array/
Author: Andrew Jarombek
Date: 2/5/2022
"""

from typing import List


def search(self, nums: List[int], target: int) -> int:
    low = 1
    high = len(nums) - 1
    pivot = self.find_pivot(nums, low, high)

    while low <= high:
        mid = (high + low) // 2
        mid_offset = (mid + pivot) % len(nums)

        if nums[mid_offset] == target:
            return mid_offset

        if nums[mid_offset] < target:
            low = mid + 1
        else:
            high = mid - 1

    index = (high + pivot) % len(nums)

    if nums[index] == target:
        return index
    else:
        return -1


def find_pivot(self, nums: List[int], low: int, high: int) -> int:
    if low > high:
        return 0

    mid = (high + low) // 2

    if nums[mid - 1] > nums[mid]:
        return mid

    return max(self.find_pivot(nums, low, mid - 1), self.find_pivot(nums, mid + 1, high))
