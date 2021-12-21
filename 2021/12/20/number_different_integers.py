"""
https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
Author: Andrew Jarombek
Date: 12/20/2021
"""


def num_different_integers(word: str) -> int:
    integers = set()

    valid = False
    start = None

    for i, c in enumerate(word):
        if c.isdigit():
            if not valid:
                valid = True
                start = i
        else:
            if valid:
                integers.add(int(word[start:i]))
                valid = False

    if valid:
        integers.add(int(word[start:len(word)]))

    return len(integers)
