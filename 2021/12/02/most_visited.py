"""
https://leetcode.com/problems/most-visited-sector-in-a-circular-track/
Author: Andrew Jarombek
Date: 12/2/2021
"""

from typing import List


def most_visited(n: int, rounds: List[int]) -> List[int]:
    start = rounds[0]
    end = rounds[-1]
    if start < end:
        return [i for i in range(start, end + 1)]
    elif start > end:
        return [i for i in range(1, end + 1)] + [i for i in range(start, n + 1)]
    else:
        return [start]
