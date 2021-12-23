"""
https://leetcode.com/problems/sorting-the-sentence
Author: Andrew Jarombek
Date: 12/22/2021
"""


def sum_base(n: int, k: int) -> int:
    result = 0

    while n > 0:
        result += n % k
        n //= k

    return result
