"""
Unit tests for the binary-tree-level-order-traversal-ii program.
Author: Andrew Jarombek
Date: 10/4/2023
"""

from program import TreeNode, Solution


def test_empty_tree():
    assert Solution.level_order_bottom(None) == []


def test_single_level_tree():
    root = TreeNode(1)
    assert Solution.level_order_bottom(root) == [[1]]


def test_two_level_tree():
    root = TreeNode(1, TreeNode(2), TreeNode(3))
    assert Solution.level_order_bottom(root) == [[2, 3], [1]]
