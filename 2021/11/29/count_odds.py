"""
https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
Author: Andrew Jarombek
Date: 11/29/2021
"""

import math


def count_odds(low: int, high: int) -> int:
    if low % 2 == 0:
        return math.ceil((high - low) / 2)
    else:
        return ((high - low) // 2) + 1
