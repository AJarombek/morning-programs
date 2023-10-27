"""
https://leetcode.com/problems/reverse-words-in-a-string/
Author: Andrew Jarombek
Date: 10/27/2023
"""


class Solution:
    @staticmethod
    def reverse_words(s: str) -> str:
        words = list(filter(lambda x: len(x) > 0, s.split(" ")))
        return " ".join(reversed(words))
