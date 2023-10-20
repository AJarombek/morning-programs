"""
https://leetcode.com/problems/word-break/
Author: Andrew Jarombek
Date: 10/19/2023
"""


class Solution:
    @staticmethod
    def word_break_v2(s: str, word_dict: list[str]) -> bool:
        def construct(string: str, memo: dict[str, bool]):
            if string in memo:
                return memo[string]

            if len(string) == 0:
                return True

            for word in word_dict:
                if string.startswith(word):
                    new_str = string[len(word):]
                    if construct(new_str, memo):
                        memo[new_str] = True
                        return True

            memo[string] = False
            return False

        return construct(s, {})

    @staticmethod
    def word_break(s: str, word_dict: list[str]) -> bool:
        if len(s) == 0:
            return True

        result = False

        for word in word_dict:
            if s.startswith(word):
                if len(s) == len(word):
                    result = True
                    break

                if Solution.word_break(s[len(word):], word_dict):
                    result = True
                    break

        return result
