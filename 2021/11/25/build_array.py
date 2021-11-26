"""
https://leetcode.com/problems/consecutive-characters/
Author: Andrew Jarombek
Date: 11/25/2021
"""

from typing import List


def build_array(target: List[int], n: int) -> List[str]:
    result = []

    index = 0
    i = 1

    while i <= n and index < len(target):
        if target[index] == i:
            result.append("Push")
            index += 1
        else:
            result.append("Push")
            result.append("Pop")

        i += 1

    return result
