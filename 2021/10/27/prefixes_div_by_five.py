"""
https://leetcode.com/problems/binary-prefix-divisible-by-5/
Author: Andrew Jarombek
Date: 10/27/2021
"""

from typing import List


def prefixes_div_by_five(nums: List[int]) -> List[bool]:
    result = []

    value = 0

    for num in nums:
        value = value * 2 + num
        result.append(value % 5 == 0)

    return result
