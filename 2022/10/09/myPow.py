"""
https://leetcode.com/problems/powx-n/
Author: Andrew Jarombek
Date: 10/9/2022
"""


def my_pow(x: float, n: int) -> float:
    if n == 0:
        return 1

    if n < 0:
        x = 1 / x
        n = -n

    y = x
    x = 1

    while n >= 1:
        if n % 2 == 0:
            y *= y
            n /= 2
        else:
            x *= y
            n -= 1

    return x
