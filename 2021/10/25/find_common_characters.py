"""
https://leetcode.com/problems/find-common-characters/
Author: Andrew Jarombek
Date: 10/25/2021
"""

from typing import List


def common_chars(words: List[str]) -> List[str]:
    all_occurrences = {}

    for index, word in enumerate(words):
        word_occurrences = {}

        for c in word:
            if c in word_occurrences:
                word_occurrences[c] = word_occurrences[c] + 1
            else:
                word_occurrences[c] = 1

        if index == 0:
            all_occurrences = word_occurrences
        else:
            for key, value in list(all_occurrences.items()):
                if key in word_occurrences:
                    all_occurrences[key] = min(all_occurrences[key], word_occurrences[key])
                else:
                    del all_occurrences[key]

    result = []

    for key, value in all_occurrences.items():
        result += [key] * value

    return result
