"""
https://leetcode.com/problems/longest-palindrome/
Author: Andrew Jarombek
Date: 8/29/2021
"""


def longest_palindrome(s: str) -> int:
    char_dict = {}

    for c in s:
        char_dict[c] = char_dict[c] + 1 if c in char_dict else 1

    items = list(char_dict.values())
    items.sort(reverse=True)

    odd_used = False
    length = 0

    for item in items:
        if item % 2 == 0:
            length += item
        else:
            if not odd_used:
                length += item
                odd_used = True
            else:
                length += item - 1

    return length


if __name__ == '__main__':
    assert longest_palindrome("abccccdd") == 7
