"""
Unit tests for the maximum-product-subarray program.
Author: Andrew Jarombek
Date: 10/29/2023
"""

from program import Solution


def test_max_product():
    assert Solution.max_product([2, 3, -2, 4]) == 6
    assert Solution.max_product([-2, 0, -1]) == 0
    assert Solution.max_product([0, 2]) == 2
    assert Solution.max_product([-2, 3, -4]) == 24
