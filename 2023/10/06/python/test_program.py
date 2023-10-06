"""
Unit tests for the path-sum-ii program.
Author: Andrew Jarombek
Date: 10/6/2023
"""

from program import TreeNode, Solution


def test_path_sum_empty_tree():
    solution = Solution()
    result = solution.path_sum(None, 0)
    assert result == []


def test_path_sum_single_level_tree():
    solution = Solution()
    result = solution.path_sum(TreeNode(1), 1)
    assert result == [[1]]


def test_path_sum_two_level_tree():
    solution = Solution()
    result = solution.path_sum(TreeNode(1, TreeNode(2), TreeNode(3)), 3)
    assert result == [[1, 2]]
