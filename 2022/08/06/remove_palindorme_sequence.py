"""
https://leetcode.com/problems/remove-palindromic-subsequences/
Author: Andrew Jarombek
Date: 8/6/2022
"""


def remove_palindrome_sub(s: str) -> int:
    start = 0
    end = len(s) - 1

    while start < end:
        if s[start] != s[end]:
            return 2

        start += 1
        end -= 1

    return 1


if __name__ == '__main__':
    assert remove_palindrome_sub("ababa") == 1
    assert remove_palindrome_sub("bbaa") == 2
