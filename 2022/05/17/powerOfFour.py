"""
https://leetcode.com/problems/power-of-four/
Author: Andrew Jarombek
Date: 5/17/2022
"""


def is_power_of_four(n: int) -> bool:
    if n <= 0:
        return False

    while n > 1:
        print(n)
        if n % 4 != 0:
            return False
        n //= 4

    return True
