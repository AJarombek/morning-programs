"""
Unit tests for the triangle program.
Author: Andrew Jarombek
Date: 10/10/2023
"""

from program import Solution


def test_minimum_total_empty_triangle():
    assert Solution.minimum_total([]) == 0


def test_minimum_total_single_row_triangle():
    assert Solution.minimum_total([[1]]) == 1


def test_minimum_total_two_row_triangle():
    assert Solution.minimum_total([[1], [2, 3]]) == 3


def test_minimum_total_three_row_triangle():
    assert Solution.minimum_total([[1], [2, 3], [4, 5, 6]]) == 7
