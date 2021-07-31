"""
https://leetcode.com/problems/valid-palindrome
Author: Andrew Jarombek
Date: 7/31/2021
"""

import re


def is_palindrome(s: str) -> bool:
    pattern = re.compile(r"[^a-zA-Z0-9]+")
    lowercase_str = re.sub(pattern, '', s).lower()

    for i in range(len(lowercase_str) // 2):
        if lowercase_str[i] != lowercase_str[-1 - i]:
            return False

    return True


if __name__ == '__main__':
    assert is_palindrome('racecar')
    assert not is_palindrome('andy')
