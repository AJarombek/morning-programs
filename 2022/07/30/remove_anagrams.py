"""
https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/
Author: Andrew Jarombek
Date: 7/30/2022
"""

from typing import List


def remove_anagrams(words: List[str]) -> List[str]:
    if len(words) == 1:
        return words

    codes = ["".join(sorted(list(word))) for word in words]

    index = 1

    while index < len(words):
        if codes[index] == codes[index - 1]:
            del codes[index]
            del words[index]
        else:
            index += 1

    while len(words) > 1 and codes[-1] == codes[-2]:
        del codes[-1]
        del words[-1]

    return words


if __name__ == '__main__':
    assert remove_anagrams(["abba", "baba", "bbaa", "cd", "cd"]) == ["abba", "cd"]
