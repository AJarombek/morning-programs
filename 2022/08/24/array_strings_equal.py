"""
https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
Author: Andrew Jarombek
Date: 8/24/2022
"""

from typing import List


def array_strings_are_equal(word1: List[str], word2: List[str]) -> bool:
    return "".join(word1) == "".join(word2)


if __name__ == '__main__':
    assert array_strings_are_equal(["ab", "c"], ["a", "bc"])
    assert not array_strings_are_equal(["ab", "dc"], ["a", "bcd"])
