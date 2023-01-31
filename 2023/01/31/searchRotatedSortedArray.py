"""
https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
Author: Andrew Jarombek
Date: 1/31/2023
"""

from typing import List


class Solution:

    @staticmethod
    def search(nums: List[int], target: int) -> bool:
        if len(nums) == 1:
            return nums[0] == target

        pivot = 0

        while pivot < len(nums) and nums[pivot] >= nums[pivot - 1]:
            pivot += 1

        low = pivot
        high = pivot + len(nums) - 1

        while low <= high:
            mid = (low + high) // 2
            val = nums[mid % len(nums)]

            if val == target:
                return True

            if val > target:
                high = mid - 1
            else:
                low = mid + 1

        return False


if __name__ == '__main__':
    assert Solution.search([2, 5, 6, 0, 0, 1, 2], 0)
    assert not Solution.search([2, 5, 6, 0, 0, 1, 2], 3)
