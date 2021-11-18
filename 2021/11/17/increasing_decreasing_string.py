"""
https://leetcode.com/problems/increasing-decreasing-string/
Author: Andrew Jarombek
Date: 11/17/2021
"""


def sort_string(s: str) -> str:
    counts = {}

    for c in s:
        counts[c] = counts.get(c, 0) + 1

    result = []
    reverse = False
    while len(counts) > 0:
        result += sorted(counts.keys(), reverse=reverse)

        for key, value in list(counts.items()):
            if value == 1:
                del counts[key]
            else:
                counts[key] = value - 1

        reverse = not reverse

    return "".join(result)
