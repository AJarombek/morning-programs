"""
https://leetcode.com/problems/sum-of-left-leaves/
Author: Andrew Jarombek
Date: 8/28/2021
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def sum_of_left_leaves(root: Optional[TreeNode]) -> int:
    return left_leaves(root, False)


def left_leaves(root: Optional[TreeNode], is_left: bool) -> int:
    if root is None:
        return 0

    if is_left and root.left is None and root.right is None:
        return root.val

    return left_leaves(root.left, True) + left_leaves(root.right, False)

