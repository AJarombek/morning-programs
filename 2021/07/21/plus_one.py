"""
https://leetcode.com/problems/plus-one/
Author: Andrew Jarombek
Date: 7/21/2021
"""

from typing import List


def plus_one(digits: List[int]) -> List[int]:
    full_increment = True

    for i in range(1, len(digits) + 1):
        index = 0 - i
        value = digits[index] + 1

        if value == 10:
            digits[index] = 0
        else:
            digits[index] = value
            full_increment = False
            break

    if full_increment:
        digits.insert(0, 1)

    return digits


if __name__ == '__main__':
    assert plus_one([0]) == [1]
    assert plus_one([9]) == [1, 0]
    assert plus_one([1, 2, 3, 4]) == [1, 2, 3, 5]
