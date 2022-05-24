"""
https://leetcode.com/problems/long-pressed-name/
Author: Andrew Jarombek
Date: 5/23/2022
"""


def is_long_pressed_name(name: str, typed: str) -> bool:
    i = 0
    j = 0
    prev = None

    while i < len(name) and j < len(typed):
        c = name[i]

        if c != prev:
            while j < len(typed) and typed[j] == prev:
                j += 1

        if j == len(typed) or c != typed[j]:
            return False

        prev = c
        i += 1
        j += 1

    while j < len(typed) and typed[j] == prev:
        j += 1

    return j == len(typed) and i == len(name)
