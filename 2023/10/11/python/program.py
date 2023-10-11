"""
https://leetcode.com/problems/longest-consecutive-sequence/
Author: Andrew Jarombek
Date: 10/11/2023
"""


class Solution:
    @staticmethod
    def longest_consecutive(nums: list[int]) -> int:
        items = {}
        longest = 0

        for num in nums:
            if num not in items:
                left = items.get(num - 1, 0)
                right = items.get(num + 1, 0)

                length = left + right + 1
                longest = max(longest, length)

                items[num] = length
                items[num - left] = length
                items[num + right] = length

        return longest
