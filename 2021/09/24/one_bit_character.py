"""
https://leetcode.com/problems/1-bit-and-2-bit-characters/
Author: Andrew Jarombek
Date: 9/24/2021
"""

# Visiting Zane for the weekend

from typing import List


def is_one_bit_character(bits: List[int]) -> bool:
    result = False
    index = 0

    while index < len(bits):
        if bits[index] == 0:
            result = True
            index += 1
        else:
            result = False
            index += 2

    return result


if __name__ == '__main__':
    assert is_one_bit_character([1, 1, 0])
    assert not is_one_bit_character([0, 1, 0])
