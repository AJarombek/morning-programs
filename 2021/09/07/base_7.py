"""
https://leetcode.com/problems/base-7/
Author: Andrew Jarombek
Date: 9/7/2021
"""


def convert_to_base7(num: int) -> str:
    negative = False
    result = ""

    if num == 0:
        return "0"

    if num < 0:
        negative = True
        num = abs(num)

    while num != 0:
        result = f"{num % 7}{result}"
        num //= 7

    if negative:
        result = f"-{result}"

    return result


if __name__ == '__main__':
    assert convert_to_base7(100) == '202'
