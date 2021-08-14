"""
Problem: https://leetcode.com/problems/power-of-two/
Author: Andrew Jarombek
Date: 8/14/2021
"""


def is_power_of_two(n: int) -> bool:
    if n == 0:
        return False

    while n != 1:
        if n % 2 == 0:
            n = n // 2
        else:
            return False

    return True


if __name__ == '__main__':
    assert is_power_of_two(16)
    assert not is_power_of_two(17)
