"""
https://leetcode.com/problems/first-unique-character-in-a-string/
Author: Andrew Jarombek
Date: 5/18/2022
"""


def first_unique_char(s: str) -> int:
    chars = {}

    for c in s:
        chars[c] = chars.get(c, 0) + 1

    for i, c in enumerate(s):
        if chars.get(c) == 1:
            return i

    return -1
