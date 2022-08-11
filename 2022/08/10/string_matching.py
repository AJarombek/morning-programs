"""
https://leetcode.com/problems/string-matching-in-an-array/
Author: Andrew Jarombek
Date: 8/10/2022
"""

from typing import List


def string_matching(words: List[str]) -> List[str]:
    result = []

    for index, word in enumerate(words):
        found = False
        i = 0

        while not found and i < len(words):
            if i != index and word in words[i]:
                found = True
                continue

            i += 1

        if found:
            result.append(word)

    return result


if __name__ == '__main__':
    assert string_matching(['and', 'andy', 'andrew', 'jar', 'jarombek']) == ['and', 'jar']
