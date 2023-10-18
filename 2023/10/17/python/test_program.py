"""
Unit tests for the single-number-ii program.
Author: Andrew Jarombek
Date: 10/17/2023
"""

from program import Solution


def test_single_number():
    assert Solution.single_number([2, 2, 3, 2]) == 3
