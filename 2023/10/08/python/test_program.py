"""
Unit tests for the populating-next-right-pointers-in-each-node program.
Author: Andrew Jarombek
Date: 10/8/2023
"""

from program import Node, Solution


def test_connect_empty_tree():
    solution = Solution()
    result = solution.connect(None)
    assert result is None


def test_connect_single_level_tree():
    solution = Solution()
    root = Node(1)
    result = solution.connect(root)
    assert result.val == 1
    assert result.left is None
    assert result.right is None
    assert result.next is None


def test_connect_two_level_tree():
    solution = Solution()
    root = Node(1, Node(2), Node(3))
    result = solution.connect(root)
    assert result.val == 1
    assert result.left.val == 2
    assert result.right.val == 3
    assert result.left.next == result.right
    assert result.right.next is None
