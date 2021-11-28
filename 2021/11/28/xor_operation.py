"""
https://leetcode.com/problems/xor-operation-in-an-array/
Author: Andrew Jarombek
Date: 11/28/2021
"""


def xor_operation(n: int, start: int) -> int:
    generator = (start + 2 * i for i in range(n))

    result = None
    for item in generator:
        if result is None:
            result = item
        else:
            result ^= item

    return result
