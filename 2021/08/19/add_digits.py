"""
Problem: https://leetcode.com/problems/add-digits/
Author: Andrew Jarombek
Date: 8/19/2021
"""


def add_digits(num: int) -> int:
    value = num

    while value >= 10:
        new_value = 0

        while value > 0:
            new_value += (value % 10)
            value //= 10

        value = new_value

    return value


if __name__ == '__main__':
    assert add_digits(38) == 2
