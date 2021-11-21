"""
https://leetcode.com/problems/find-lucky-integer-in-an-array/
Author: Andrew Jarombek
Date: 11/21/2021
"""

from typing import List


def find_lucky(arr: List[int]) -> int:
    lucky_set = set()
    frequencies = {}

    for num in arr:
        frequency = frequencies.get(num, 0)

        if frequency == num:
            lucky_set -= {num}
        elif frequency + 1 == num:
            lucky_set.add(num)

        frequencies[num] = frequency + 1

    if len(lucky_set) == 0:
        return -1

    return max(lucky_set)
