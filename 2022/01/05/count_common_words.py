"""
https://leetcode.com/problems/count-common-words-with-one-occurrence/
Author: Andrew Jarombek
Date: 1/5/2022
"""

from typing import List


def count_words(words1: List[str], words2: List[str]) -> int:
    include1 = set()
    exclude1 = set()

    include2 = set()
    exclude2 = set()

    for word in words1:
        if word in include1:
            include1.discard(word)
            exclude1.add(word)
        elif word not in exclude1:
            include1.add(word)

    for word in words2:
        if word in include2:
            include2.discard(word)
            exclude2.add(word)
        elif word not in exclude2:
            include2.add(word)

    return len(include1 & include2)
