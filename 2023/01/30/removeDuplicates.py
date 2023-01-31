"""
https://leetcode.com/problems/word-search/
Author: Andrew Jarombek
Date: 1/30/2023
"""

from typing import List


class Solution:

    @staticmethod
    def remove_duplicates(nums: List[int]) -> int:
        prev = nums[0]
        count = 0
        i = 0

        for j, num in enumerate(nums):
            if num == prev:
                if count < 2:
                    nums[i] = num
                    count += 1
                    i += 1
            else:
                nums[i] = num
                prev = num
                count = 1
                i += 1

        return i


if __name__ == '__main__':
    nums = [1, 1, 1, 2, 2, 3]
    assert Solution.remove_duplicates(nums) == 5
    assert nums == [1, 1, 2, 2, 3, 3]
