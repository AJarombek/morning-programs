"""
https://leetcode.com/problems/positions-of-large-groups/
Author: Andrew Jarombek
Date: 10/7/2021
"""

from typing import List


def large_group_positions(s: str) -> List[List[int]]:
    result = []

    current = s[0]
    start = 0

    for i in range(1, len(s)):
        if s[i] != current:
            if i - start >= 3:
                result.append([start, i - 1])

            start = i
            current = s[i]

    if len(s) - start >= 3:
        result.append([start, len(s) - 1])

    return result
