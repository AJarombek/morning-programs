"""
https://leetcode.com/problems/subsets-ii/
Author: Andrew Jarombek
Date: 2/13/2023
"""


class Solution:
    def subsetsWithDup(self, nums: list[int]) -> list[tuple[int]]:
        result = {()}

        for i in range(1, len(nums) + 1):
            for combo in self.combinations(nums, i):
                result.add(tuple(sorted(combo)))

        return list(result)

    def combinations(self, nums: list[int], n: int) -> set[tuple[int]]:
        if n == 0:
            return {()}

        result = set()

        for i in range(len(nums)):
            combos = self.combinations(nums[i + 1:], n - 1)

            for combo in combos:
                result.add((nums[i],) + combo)

        return result
