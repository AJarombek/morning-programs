"""
https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/
Author: Andrew Jarombek
Date: 12/3/2021
"""


def modify_string(s: str) -> str:
    chars = list(s)

    for i, c in enumerate(chars):
        if chars[i] == '?':
            if i > 0 and chars[i - 1] == 'a':
                if i + 1 < len(chars) and chars[i + 1] == 'b':
                    chars[i] = 'c'
                else:
                    chars[i] = 'b'
            elif i > 0 and chars[i - 1] == 'b':
                if i + 1 < len(chars) and chars[i + 1] == 'a':
                    chars[i] = 'c'
                else:
                    chars[i] = 'a'
            else:
                if i + 1 < len(chars) and chars[i + 1] == 'a':
                    chars[i] = 'b'
                else:
                    chars[i] = 'a'

    return "".join(chars)
