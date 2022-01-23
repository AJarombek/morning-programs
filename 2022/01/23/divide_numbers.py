"""
https://leetcode.com/problems/divide-two-integers/
Author: Andrew Jarombek
Date: 1/23/2022
"""


def divide_fast(dividend: int, divisor: int) -> int:
    negative = (dividend < 0) != (divisor < 0)

    if dividend == -2 ** 31 and not negative:
        dividend = -2 ** 31 + 1

    if divisor == -2 ** 31 and not negative:
        divisor = -2 ** 31 + 1

    dividend = abs(dividend)
    divisor = abs(divisor)

    result = 0

    while dividend >= divisor:
        i = 1
        temp = divisor

        while dividend >= temp << 1:
            i <<= 1
            temp <<= 1

        result += i
        dividend -= temp

    if negative:
        result = -result

    return result


def divide_slow(dividend: int, divisor: int) -> int:
    negative = dividend < 0

    if divisor < 0:
        negative = not negative

    if dividend == -2 ** 31 and not negative:
        dividend = -2 ** 31 + 1

    if divisor == 1:
        return dividend

    if divisor == -1:
        return -dividend

    dividend = abs(dividend)
    divisor = abs(divisor)

    result = 0
    while dividend >= divisor:
        result += 1
        dividend -= divisor

    if negative:
        result = -result

    return result
