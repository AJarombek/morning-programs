"""
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
Author: Andrew Jarombek
Date: 8/4/2022
"""

import math
from typing import List


def find_numbers(nums: List[int]) -> int:
    result = 0

    for num in nums:
        count = 0

        while num > 0:
            count += 1
            num //= 10

        if count % 2 == 0:
            result += 1

    return result


def find_numbers_v2(nums: List[int]) -> int:
    result = 0

    for num in nums:
        count = 1 + math.log10(num) // 1

        if count % 2 == 0:
            result += 1

    return result


if __name__ == '__main__':
    assert find_numbers([12, 345, 2, 6, 7896]) == 2
    assert find_numbers_v2([12, 345, 2, 6, 7896]) == 2
