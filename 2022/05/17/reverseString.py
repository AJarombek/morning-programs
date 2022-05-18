"""
https://leetcode.com/problems/reverse-string/
Author: Andrew Jarombek
Date: 5/17/2022
"""

from typing import List


def reverse_string(s: List[str]) -> None:
    start = 0
    end = len(s) - 1

    while start < end:
        temp = s[end]
        s[end] = s[start]
        s[start] = temp

        start += 1
        end -= 1