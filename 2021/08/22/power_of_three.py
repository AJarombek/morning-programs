"""
Problem: https://leetcode.com/problems/power-of-three/
Author: Andrew Jarombek
Date: 8/22/2021
"""


def is_power_of_three(n: int) -> bool:
    if n < 3:
        return n == 1

    while n > 3:
        m = n / 3

        if not m.is_integer():
            return False

        n = int(m)

    return n == 3


if __name__ == '__main__':
    assert not is_power_of_three(0)
    assert is_power_of_three(1)
    assert is_power_of_three(9)
    assert not is_power_of_three(10)
