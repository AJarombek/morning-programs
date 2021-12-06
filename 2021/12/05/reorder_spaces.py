"""
https://leetcode.com/problems/rearrange-spaces-between-words/
Author: Andrew Jarombek
Date: 12/5/2021
"""

import re


def reorder_spaces(text: str) -> str:
    words = re.split("\\s+", text)
    words = list(filter(lambda x: len(x) > 0, words))

    spaces = 0
    for c in text:
        if c == ' ':
            spaces += 1

    if len(words) == 1:
        return words[0] + " " * spaces

    space = spaces // (len(words) - 1)

    result = ""

    for word in words[:-1]:
        result += word + " " * space

    result += words[-1]

    result += " " * (spaces % (len(words) - 1))
    return result