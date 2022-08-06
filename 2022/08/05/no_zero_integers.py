"""
https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
Author: Andrew Jarombek
Date: 8/5/2022
"""

from typing import List


def get_no_zero_integers(n: int) -> List[int]:
    a = 1
    b = n - 1

    while a <= b:
        if '0' not in str(a) and '0' not in str(b):
            return [a, b]

        a += 1
        b -= 1

    return [-1, -1]


if __name__ == '__main__':
    assert get_no_zero_integers(11) == [2, 9]
