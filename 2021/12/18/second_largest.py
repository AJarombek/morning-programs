"""
https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
Author: Andrew Jarombek
Date: 12/18/2021
"""


def second_highest(s: str) -> int:
    largest = (-1, -1)

    for c in s:
        if 48 <= ord(c) <= 57:
            num = int(c)

            if num > largest[0]:
                largest = (num, largest[0])
            elif num > largest[1] and num != largest[0]:
                largest = (largest[0], num)

    return largest[1]
