"""
https://leetcode.com/problems/implement-strstr/
Author: Andrew Jarombek
Date: 7/18/2021
"""


def str_str(haystack: str, needle: str) -> int:
    if len(needle) == 0:
        return 0

    for i in range(len(haystack)):
        if needle == haystack[i:i + len(needle)]:
            return i

    return -1


if __name__ == '__main__':
    assert str_str("", "") == 0
    assert str_str("abc", "d") == -1
    assert str_str("hello", "ll") == 2
