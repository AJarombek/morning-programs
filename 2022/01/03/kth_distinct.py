"""
https://leetcode.com/problems/kth-distinct-string-in-an-array/
Author: Andrew Jarombek
Date: 1/3/2022
"""

from typing import List


def kth_distinct(arr: List[str], k: int) -> str:
    instances = {}

    for s in arr:
        instances[s] = instances.get(s, 0) + 1

    count = 0
    for s in arr:
        if instances.get(s) == 1:
            count += 1

            if count == k:
                return s

    return ""
