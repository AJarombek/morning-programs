"""
https://leetcode.com/problems/search-insert-position/
Author: Andrew Jarombek
Date: 7/19/2021
"""

from typing import List


def search_insert(nums: List[int], target: int) -> int:
    start = 0
    end = len(nums) - 1

    while start <= end:
        mid = (end + start) // 2

        val = nums[mid]
        if val == target:
            return mid
        elif val < target:
            start = mid + 1
        else:
            end = mid - 1

    end = min(start, len(nums) - 1)
    start = max(end, 0)

    start_val = nums[start]
    end_val = nums[end]

    if start_val == target:
        return start
    elif end_val == target:
        return end
    elif start_val < target and end_val > target:
        return end + 1
    elif start_val < target and end_val < target:
        return start + 1
    else:
        return start


if __name__ == '__main__':
    assert search_insert([1, 3, 5, 6], 5) == 2
    assert search_insert([1, 3, 5, 6], 2) == 1
