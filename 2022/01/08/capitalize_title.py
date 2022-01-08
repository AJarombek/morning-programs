"""
https://leetcode.com/problems/capitalize-the-title/
Author: Andrew Jarombek
Date: 1/8/2022
"""


def capitalize_title(title: str) -> str:
    words = title.split(" ")

    for index, word in enumerate(words):
        if len(word) < 3:
            words[index] = word.lower()
        else:
            words[index] = word[0].upper() + word[1:].lower()

    return " ".join(words)
