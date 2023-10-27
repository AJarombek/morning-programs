"""
Unit tests for the reverse-words-in-a-string program.
Author: Andrew Jarombek
Date: 10/27/2023
"""

from program import Solution


def test_reverse_words():
    assert Solution.reverse_words("the sky is blue") == "blue is sky the"
    assert Solution.reverse_words("  hello world  ") == "world hello"
    assert Solution.reverse_words("a good   example") == "example good a"
