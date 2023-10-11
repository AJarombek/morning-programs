"""
Unit tests for the longest-consecutive-sequence program.
Author: Andrew Jarombek
Date: 10/11/2023
"""

from program import Solution


def test_longest_consecutive_empty():
    assert Solution.longest_consecutive([]) == 0


def test_longest_consecutive_single():
    assert Solution.longest_consecutive([1]) == 1


def test_longest_consecutive_two():
    assert Solution.longest_consecutive([1, 2]) == 2


def test_longest_consecutive_ten():
    assert Solution.longest_consecutive([100, 4, 200, 1, 3, 2, 6, 5, 7]) == 7


def test_longest_consecutive_negative():
    assert Solution.longest_consecutive([-1, 0]) == 2
