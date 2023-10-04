"""
Unit tests for the construct-binary-tree-from-inorder-and-postorder-traversal program.
Author: Andrew Jarombek
Date: 10/3/2023
"""

from program import TreeNode, Solution


def test_empty_tree():
    assert Solution.build_tree([], []) is None


def test_single_level_tree():
    root = TreeNode(1)
    assert Solution.build_tree([1], [1]) == root


def test_two_level_tree():
    root = TreeNode(1, TreeNode(2), TreeNode(3))
    assert Solution.build_tree([2, 1, 3], [2, 3, 1]) == root
