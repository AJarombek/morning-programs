"""
https://leetcode.com/problems/unique-number-of-occurrences/
Author: Andrew Jarombek
Date: 11/10/2021
"""

from typing import List


def unique_occurrences(arr: List[int]) -> bool:
    occurrences = {}

    for item in arr:
        occurrences[item] = occurrences.get(item, 0) + 1

    values = set()

    for value in occurrences.values():
        if value in values:
            return False

        values.add(value)

    return True
