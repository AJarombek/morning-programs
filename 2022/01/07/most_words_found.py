"""
https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
Author: Andrew Jarombek
Date: 1/7/2022
"""

from typing import List


def most_words_found(sentences: List[str]) -> int:
    maximum = 0

    for sentence in sentences:
        count = 1

        for c in sentence:
            if c == ' ':
                count += 1

        maximum = max(maximum, count)

    return maximum
