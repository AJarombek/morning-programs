"""
Unit tests for the binary-tree-level-order-traversal program.
Author: Andrew Jarombek
Date: 10/1/2023
"""

from program import TreeNode, Solution


def test_empty_tree():
    assert Solution.zigzag_level_order(None) == []


def test_single_level_tree():
    root = TreeNode(1)
    assert Solution.zigzag_level_order(root) == [[1]]


def test_two_level_tree():
    root = TreeNode(1, TreeNode(2), TreeNode(3))
    assert Solution.zigzag_level_order(root) == [[1], [3, 2]]
