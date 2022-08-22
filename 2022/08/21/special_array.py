"""
https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
Author: Andrew Jarombek
Date: 8/21/2022
"""

from typing import List


def special_array(nums: List[int]) -> int:
    sorted_nums = sorted(nums)
    value = len(nums)
    prev = -1

    print(sorted_nums)
    for num in sorted_nums:
        if value <= num and value > prev and prev != num:
            return value

        value -= 1
        prev = num

    return -1


if __name__ == '__main__':
    assert special_array([3, 5]) == 2
    assert special_array([0, 0]) == -1
    assert special_array([0, 4, 3, 0, 4]) == 3
