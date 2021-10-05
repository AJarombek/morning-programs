"""
https://leetcode.com/problems/unique-morse-code-words/
Author: Andrew Jarombek
Date: 10/4/2021
"""

from typing import List


def unique_morse_representations(words: List[str]) -> int:
    morse = [".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
             ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."]

    transformations = set()

    for word in words:
        transform = "".join(morse[ord(c) - ord('a')] for c in word)
        transformations.add(transform)

    return len(transformations)
