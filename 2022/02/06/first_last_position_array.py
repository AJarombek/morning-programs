"""
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
Author: Andrew Jarombek
Date: 2/6/2022
"""

from typing import List


def search_range(nums: List[int], target: int) -> List[int]:
    low = 1
    high = len(nums) - 1

    result = [-1, -1]

    if len(nums) == 0:
        return result

    if nums[0] == target:
        result[0] = 0
    else:
        while low <= high:
            mid = (low + high) // 2

            if nums[mid] == target and nums[mid - 1] != target:
                result[0] = mid
                break

            if nums[mid] >= target:
                high = mid - 1
            else:
                low = mid + 1

    if result[0] == -1:
        return result

    low = result[0]
    high = len(nums) - 2

    if nums[-1] == target:
        result[1] = len(nums) - 1
    else:
        while low <= high:
            mid = (low + high) // 2

            if nums[mid] == target and nums[mid + 1] != target:
                result[1] = mid
                break

            if nums[mid] > target:
                high = mid - 1
            else:
                low = mid + 1

    return result
