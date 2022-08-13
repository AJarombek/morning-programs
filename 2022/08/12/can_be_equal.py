"""
https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
Author: Andrew Jarombek
Date: 8/12/2022
"""

from typing import List


def can_be_equal(target: List[int], arr: List[int]) -> bool:
    chars = {}

    for num in target:
        chars[num] = chars.get(num, 0) + 1

    for num in arr:
        chars[num] = chars.get(num, 0) - 1

    for _, value in chars.items():
        if value != 0:
            return False

    return True


if __name__ == '__main__':
    assert can_be_equal([1, 2, 3, 4], [2, 4, 1, 3])
    assert not can_be_equal([3, 7, 9], [3, 7, 11])
