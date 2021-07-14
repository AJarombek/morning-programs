"""
https://leetcode.com/problems/reverse-integer/
Author: Andrew Jarombek
Date: 7/14/2021
"""


def reverse(x: int) -> int:
    x_str = str(x)
    prefix = ''
    if x_str[0] == '-':
        prefix = '-'
        x_str = x_str[1:]

    reverse_x = x_str[::-1]

    start = 0
    while reverse_x[start] == '0' and start + 1 < len(reverse_x):
        start += 1

    result = int(prefix + reverse_x[start:])

    if result > 2 ** 31 - 1 or result < -2 ** 31:
        return 0

    return result


if __name__ == '__main__':
    assert reverse(123) == 321
    assert reverse(-123) == -321
    assert reverse(0) == 0
    assert reverse(100) == 1
    assert reverse(123456789) == 987654321
    assert reverse(1234567899) == 0
