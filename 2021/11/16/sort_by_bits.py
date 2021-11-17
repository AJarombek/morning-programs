"""
https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
Author: Andrew Jarombek
Date: 11/16/2021
"""


from typing import List


def sort_by_bits(arr: List[int]) -> List[int]:
    def sort(x: int):
        y = x
        ones = 0

        while x > 0:
            if x & 1 == 1:
                ones += 1

            x = x >> 1

        return ones, y

    return sorted(arr, key=sort)
