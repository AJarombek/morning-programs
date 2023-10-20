"""
Unit tests for the word-break program.
Author: Andrew Jarombek
Date: 10/19/2023
"""

from program import Solution


def test_word_break():
    assert Solution.word_break('leetcode', ['leet', 'code'])
    assert Solution.word_break('applepenapple', ['apple', 'pen'])
    assert not Solution.word_break('catsandog', ['cats', 'dog', 'sand', 'and', 'cat'])
