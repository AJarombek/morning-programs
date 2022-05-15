"""
https://leetcode.com/problems/invert-binary-tree/
Author: Andrew Jarombek
Date: 5/15/2022
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def invert_tree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
    if root is None:
        return None

    left = root.left
    root.left = root.right
    root.right = left

    self.invertTree(root.left)
    self.invertTree(root.right)

    return root