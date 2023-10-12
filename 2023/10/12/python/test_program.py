"""
Unit tests for the sum-root-to-leaf-numbers program.
Author: Andrew Jarombek
Date: 10/12/2023
"""

from program import Solution, TreeNode


def test_sum_numbers_empty():
    assert Solution.sum_numbers(None) == 0


def test_sum_numbers_single():
    assert Solution.sum_numbers(TreeNode(1)) == 1


def test_sum_numbers_two():
    root = TreeNode(1, TreeNode(2), TreeNode(3))
    assert Solution.sum_numbers(root) == 25
