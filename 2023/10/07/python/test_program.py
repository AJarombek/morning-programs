"""
Unit tests for the flatten-binary-tree-to-linked-list program.
Author: Andrew Jarombek
Date: 10/7/2023
"""

from program import TreeNode, Solution


def test_flatten_empty_tree():
    solution = Solution()
    solution.flatten(None)


def test_flatten_single_level_tree():
    solution = Solution()
    root = TreeNode(1)
    solution.flatten(root)
    assert root.val == 1
    assert root.left is None
    assert root.right is None


def test_flatten_two_level_tree():
    solution = Solution()
    root = TreeNode(1, TreeNode(2), TreeNode(3))
    solution.flatten(root)
    assert root.val == 1
    assert root.left is None
    assert root.right.val == 2
    assert root.right.left is None
    assert root.right.right.val == 3
    assert root.right.right.left is None
    assert root.right.right.right is None


def test_flatten_three_level_tree():
    solution = Solution()
    root = TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4)), TreeNode(5, None, TreeNode(6)))
    solution.flatten(root)
    assert root.val == 1
    assert root.left is None
    assert root.right.val == 2
    assert root.right.left is None
    assert root.right.right.val == 3
    assert root.right.right.left is None
    assert root.right.right.right.val == 4
    assert root.right.right.right.left is None
    assert root.right.right.right.right.val == 5
    assert root.right.right.right.right.left is None
    assert root.right.right.right.right.right.val == 6
    assert root.right.right.right.right.right.left is None
    assert root.right.right.right.right.right.right is None
