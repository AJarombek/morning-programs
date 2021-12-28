"""
https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
Author: Andrew Jarombek
Date: 12/28/2021
"""


def sum_of_digits(s: str, k: int) -> int:
    val = []

    for c in s:
        i = ord(c) - ord('a') + 1

        while i > 0:
            val.append(i % 10)
            i //= 10

    transformed_val = sum(val)
    k -= 1

    while k > 0:
        result = 0

        while transformed_val > 0:
            result += transformed_val % 10
            transformed_val //= 10

        transformed_val = result
        k -= 1

    return transformed_val
