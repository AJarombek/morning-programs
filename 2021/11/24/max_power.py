"""
https://leetcode.com/problems/consecutive-characters/
Author: Andrew Jarombek
Date: 11/24/2021
"""


def max_power(s: str) -> int:
    prev = ''
    count = 0
    power = 1

    for c in s:
        if c == prev:
            count += 1
        else:
            count = 1
            prev = c

        power = max(power, count)

    return power
