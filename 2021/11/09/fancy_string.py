"""
https://leetcode.com/problems/delete-characters-to-make-fancy-string/
Author: Andrew Jarombek
Date: 11/9/2021
"""


def make_fancy_string(s: str) -> str:
    streak = 1
    last = ''
    result = ''

    for c in s:
        streak = streak + 1 if c == last else 1

        if streak < 3:
            result += c

        last = c

    return result


def make_fancy_string_alternate_approach(s: str) -> str:
    streak = 1
    last = ''
    result = []

    for c in s:
        streak = streak + 1 if c == last else 1

        if streak < 3:
            result.append(c)

        last = c

    return ''.join(result)
