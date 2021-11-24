"""
https://leetcode.com/problems/reformat-the-string/
Author: Andrew Jarombek
Date: 11/23/2021
"""

from typing import List, Dict


def reformat(s: str) -> str:
    letters = {}
    letter_count = 0
    digits = {}
    digit_count = 0

    for c in s:
        if c <= 'z' and c >= 'a':
            letters[c] = letters.get(c, 0) + 1
            letter_count += 1
        else:
            digits[c] = digits.get(c, 0) + 1
            digit_count += 1

    if abs(letter_count - digit_count) > 1:
        return ''

    result = []
    letters_first = True

    if letter_count > digit_count:
        append_result(result, letters)
    elif digit_count > letter_count:
        append_result(result, digits)
        letters_first = False

    while len(letters) > 0:
        if letters_first:
            append_result(result, digits)
            append_result(result, letters)
        else:
            append_result(result, letters)
            append_result(result, digits)

    return "".join(result)


def append_result(result: List[str], chars: Dict[str, int]) -> None:
    key, value = chars.popitem()
    result.append(key)

    if value > 1:
        chars[key] = value - 1
