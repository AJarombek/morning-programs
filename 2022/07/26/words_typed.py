"""
https://leetcode.com/problems/maximum-number-of-words-you-can-type/
Author: Andrew Jarombek
Date: 7/26/2022
"""


def can_be_typed_words(text: str, broken_letters: str) -> int:
    words = text.split(" ")
    letter_set = set(list(broken_letters))
    result = 0

    for word in words:
        valid = True

        for c in word:
            if c in letter_set:
                valid = False
                break

        if valid:
            result += 1

    return result


if __name__ == '__main__':
    assert can_be_typed_words("hello world", "ab") == 2
    assert can_be_typed_words("hello world", "rd") == 1
    assert can_be_typed_words("hello world", "wl") == 0
