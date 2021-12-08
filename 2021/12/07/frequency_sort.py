"""
https://leetcode.com/problems/sort-array-by-increasing-frequency/
Author: Andrew Jarombek
Date: 12/7/2021
"""

from typing import List


def frequency_sort(nums: List[int]) -> List[int]:
    frequencies = {}

    for num in nums:
        frequencies[num] = frequencies.get(num, 0) + 1

    return sorted(nums, key=lambda x: (frequencies.get(x), -x))
