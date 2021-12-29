"""
https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/
Author: Andrew Jarombek
Date: 12/29/2021
"""

from typing import List


def is_prefix_string(s: str, words: List[str]) -> bool:
    s2 = ""

    for word in words:
        s2 += word

        if len(s2) > len(s):
            return False

        if s == s2:
            return True

    return False


def is_prefix_string_faster(s: str, words: List[str]) -> bool:
    index = 0

    for word in words:
        if word != s[index:index + len(word)]:
            return False

        index += len(word)

        if index == len(s):
            return True
        elif index > len(s):
            return False

    return False
