"""
https://leetcode.com/problems/maximum-product-subarray/
Author: Andrew Jarombek
Date: 10/29/2023
"""


class Solution:
    @staticmethod
    def max_product(nums: list[int]) -> int:
        if not nums:
            return 0

        max_here = nums[0]
        min_here = nums[0]
        result = nums[0]

        for num in nums[1:]:
            if num < 0:
                max_here, min_here = min_here, max_here

            max_here = max(num, max_here * num)
            min_here = min(num, min_here * num)

            result = max(result, max_here)

        return result
