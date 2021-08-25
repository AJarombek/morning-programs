"""
Problem: https://leetcode.com/problems/valid-perfect-square/
Author: Andrew Jarombek
Date: 8/25/2021
"""

# I hope you are ok


def is_perfect_square(num: int) -> bool:
    return (num ** (1 / 2)).is_integer()


if __name__ == '__main__':
    assert is_perfect_square(9)
    assert not is_perfect_square(10)
