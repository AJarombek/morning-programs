"""
https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
Author: Andrew Jarombek
Date: 11/14/2021
"""

from typing import List


def sum_zero_improved(n: int) -> List[int]:
    result = []

    if n % 2 == 1:
        result.append(0)
        n -= 1

    while n > 0:
        result.append(n // 2)
        result.append(-(n // 2))
        n -= 2

    return result


def sum_zero(n: int) -> List[int]:
    result = []

    if n % 2 == 1:
        result.append(0)
        n -= 1

    count = 1

    while n > 0:
        result.append(count)
        result.append(-count)
        count += 1
        n -= 2

    return result
