"""
https://leetcode.com/problems/count-the-number-of-consistent-strings/
Author: Andrew Jarombek
Date: 12/10/2021
"""

from typing import List


def count_consistent_strings(allowed: str, words: List[str]) -> int:
    allowed_set = set(allowed)
    result = 0

    for word in words:
        valid = True
        index = 0

        while valid and index < len(word):
            if word[index] not in allowed_set:
                valid = False

            index += 1

        if valid:
            result += 1

    return result
