"""
https://leetcode.com/problems/maximum-product-of-three-numbers/
Author: Andrew Jarombek
Date: 9/18/2021
"""

from typing import List


def maximum_product(nums: List[int]) -> int:
    nums.sort()
    return max(nums[0] * nums[1] * nums[-1], nums[-1] * nums[-2] * nums[-3])
