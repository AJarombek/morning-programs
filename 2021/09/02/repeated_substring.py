"""
https://leetcode.com/problems/repeated-substring-pattern/
Author: Andrew Jarombek
Date: 9/2/2021
"""


def repeated_substring_pattern(s: str) -> bool:
    for i in range(1, (len(s) // 2) + 1):
        if s[i:] + s[:i] == s:
            return True

    return False


def repeated_substring_pattern_v2(s: str) -> bool:
    return s in (s + s)[1:-1]


if __name__ == '__main__':
    assert repeated_substring_pattern("abab")
    assert not repeated_substring_pattern("aba")
    assert repeated_substring_pattern_v2("abab")
    assert not repeated_substring_pattern_v2("aba")
