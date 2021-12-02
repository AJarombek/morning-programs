"""
https://leetcode.com/problems/thousand-separator/
Author: Andrew Jarombek
Date: 12/1/2021
"""


def thousand_separator(n: int) -> str:
    if n < 1000:
        return f'{n}'

    result = []
    digit = 0

    while n > 0:
        value = n % 10

        if digit % 3 == 0:
            result.append('.')

        result.append(f'{value}')

        n //= 10
        digit += 1

    return "".join(result[:0:-1])
