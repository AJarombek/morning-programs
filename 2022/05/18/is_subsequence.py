"""
https://leetcode.com/problems/is-subsequence/
Author: Andrew Jarombek
Date: 5/18/2022
"""


def is_subsequence(s: str, t: str) -> bool:
    i = 0
    j = 0

    while i < len(s) and j < len(t):
        if s[i] == t[j]:
            i += 1

        j += 1

    return i == len(s)