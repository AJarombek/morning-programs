"""
https://leetcode.com/problems/range-sum-query-immutable/
Author: Andrew Jarombek
Date: 5/16/2022
"""

from typing import List


class NumArray:
    def __init__(self, nums: List[int]):
        self.nums = nums

    def sum_range(self, left: int, right: int) -> int:
        return sum(self.nums[left:right + 1])
