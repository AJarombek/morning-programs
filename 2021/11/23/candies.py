"""
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
Author: Andrew Jarombek
Date: 11/23/2021
"""

from typing import List


def kids_with_candies(candies: List[int], extra_candies: int) -> List[bool]:
    greatest = max(candies)
    return [num + extra_candies >= greatest for num in candies]


def kids_with_candies_runtime_optimization(candies: List[int], extra_candies: int) -> List[bool]:
    greatest = max(candies) - extra_candies
    return [num >= greatest for num in candies]
