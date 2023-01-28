"""
https://leetcode.com/problems/subsets/
Author: Andrew Jarombek
Date: 1/28/2023
"""

from typing import List


class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = [[]]

        for i in range(1, len(nums) + 1):
            result += list(self.combinations(nums, i))

        return result

    def combinations(self, nums: List[int], n: int):
        for i in range(len(nums)):
            if n == 1:
                yield nums[i],
            else:
                for next_val in self.combinations(nums[i+1:], n - 1):
                    yield (nums[i],) + next_val


class SolutionV2:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = [[]]

        for i in range(1, len(nums) + 1):
            result += self.combinations(nums, i)

        return result

    def combinations(self, nums: List[int], n: int):
        if n == 0:
            return [[]]

        result = []

        for i in range(len(nums)):
            remaining = nums[i + 1:]
            remaining_combinations = self.combinations(nums[i + 1:], n - 1)

            for combo in remaining_combinations:
                result.append([nums[i], *combo])

        return result


if __name__ == '__main__':
    solution = Solution()
    assert solution.subsets([1, 2, 3]) == [[], (1,), (2,), (3,), (1, 2), (1, 3), (2, 3), (1, 2, 3)]

    solution = SolutionV2()
    assert solution.subsets([1, 2, 3]) == [[], [1], [2], [3], [1, 2], [1, 3], [2, 3], [1, 2, 3]]
