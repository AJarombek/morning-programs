"""
Author: Andrew Jarombek
Date: 8/20/2021
"""


def is_good_version(version: int) -> int:
    pass


def first_good_version(n: int) -> int:
    start = 0
    end = n

    while end != start:
        middle = (end + start) // 2
        if is_good_version(middle):
            end = middle
        else:
            start = middle + 1

    return start
