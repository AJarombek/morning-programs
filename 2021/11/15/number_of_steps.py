"""
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
Author: Andrew Jarombek
Date: 11/15/2021
"""


def number_of_steps(num: int) -> int:
    steps = 0

    while num > 0:
        steps += 1
        if num % 2 == 0:
            num //= 2
        else:
            num -= 1

    return steps
