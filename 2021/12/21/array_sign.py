"""
https://leetcode.com/problems/sign-of-the-product-of-an-array/
Author: Andrew Jarombek
Date: 12/21/2021
"""

from typing import List


def array_sign(nums: List[int]) -> int:
    neg = 0

    for num in nums:
        if num == 0:
            return 0
        elif num < 0:
            neg += 1

    return 1 if neg % 2 == 0 else -1
