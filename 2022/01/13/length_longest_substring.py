"""
https://leetcode.com/problems/longest-substring-without-repeating-characters/
Author: Andrew Jarombek
Date: 1/13/2022
"""


def length_of_longest_substring(s: str) -> int:
    longest = 0
    start = 0
    end = 0
    chars = set()

    while end < len(s):
        c = s[end]

        while c in chars:
            chars.remove(s[start])
            start += 1

        chars.add(c)
        end += 1
        longest = max(longest, end - start)

    return longest
