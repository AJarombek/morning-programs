"""
https://leetcode.com/problems/string-to-integer-atoi/
Author: Andrew Jarombek
Date: 1/15/2022
"""


def my_atoi(s: str) -> int:
    s = s.lstrip()

    if s == '':
        return 0

    index = 0
    value = 0
    negative = False

    if s[index] == '-':
        negative = True
        index = 1
    elif s[index] == '+':
        index = 1

    if index == len(s):
        return 0

    c = s[index]

    while c >= '0' and c <= '9':
        value *= 10
        value += int(c)
        index += 1

        if index == len(s):
            break

        c = s[index]

    if negative:
        if value > 2 ** 31:
            value = 2 ** 31
        value = -value
    else:
        if value > 2 ** 31 - 1:
            value = 2 ** 31 - 1

    return value
