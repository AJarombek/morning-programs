"""
https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
Author: Andrew Jarombek
Date: 8/15/2022
"""

from typing import List

# Sending you all my love.


def can_make_arithmetic_progression(arr: List[int]) -> bool:
    sorted_arr = sorted(arr)
    diff = sorted_arr[1] - sorted_arr[0]

    for index, val in enumerate(sorted_arr[2:]):
        if val - sorted_arr[index + 1] != diff:
            return False

    return True


if __name__ == '__main__':
    assert can_make_arithmetic_progression([3, 5, 1])
    assert not can_make_arithmetic_progression([1, 2, 4])
