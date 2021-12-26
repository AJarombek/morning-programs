"""
https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
Author: Andrew Jarombek
Date: 12/26/2021
"""

from typing import List


def make_equal(words: List[str]) -> bool:
    if len(words) == 1:
        return True

    total_length = 0
    chars = {}

    for word in words:
        total_length += len(word)

        for c in word:
            chars[c] = chars.get(c, 0) + 1

    size, remainder = divmod(total_length, len(words))
    if remainder != 0:
        return False

    print(chars.values())
    for value in chars.values():
        if value % len(words) != 0:
            return False

    return True
