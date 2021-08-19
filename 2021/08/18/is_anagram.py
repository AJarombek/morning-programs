"""
Problem: https://leetcode.com/problems/valid-anagram/
Author: Andrew Jarombek
Date: 8/18/2021
"""


def is_anagram(s: str, t: str) -> bool:
    chars = {}

    for c in s:
        if c in chars:
            chars[c] = chars[c] + 1
        else:
            chars[c] = 1

    for c in t:
        if c in s:
            val = chars[c]

            if val == 0:
                return False
            else:
                chars[c] = val - 1
        else:
            return False

    for k, v in chars.items():
        if v > 0:
            return False

    return True


if __name__ == '__main__':
    assert is_anagram('hello', 'olleh')
    assert not is_anagram('rat', 'car')
