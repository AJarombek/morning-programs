"""
https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/
Author: Andrew Jarombek
Date: 12/24/2021
"""


def check_zero_ones(s: str) -> bool:
    max_zeros = 0
    max_ones = 0
    segment = 0
    value = '0'

    for c in s:
        if c == value:
            segment += 1
        else:
            value = c
            segment = 1

        if value == '1':
            max_ones = max(max_ones, segment)
        else:
            max_zeros = max(max_zeros, segment)

    return max_ones > max_zeros
