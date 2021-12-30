"""
https://leetcode.com/problems/find-greatest-common-divisor-of-array/
Author: Andrew Jarombek
Date: 12/30/2021
"""

from typing import List


def find_gcd(nums: List[int]) -> int:
    smallest = min(nums)
    largest = max(nums)
    n = smallest

    while n > 1:
        if smallest % n == 0 and largest % n == 0:
            return n

        n -= 1

    return 1


# https://crypto.stanford.edu/pbc/notes/numbertheory/euclid.html
def find_gcd_euclid_algorithm(nums: List[int]) -> int:
    smallest = min(nums)
    largest = max(nums)

    while smallest > 1:
        val = largest % smallest

        if val == 0:
            return smallest

        largest = smallest
        smallest = val

    return 1
