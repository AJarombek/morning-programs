"""
https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
Author: Andrew Jarombek
Date: 10/7/2023
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    @staticmethod
    def flatten(root: Optional[TreeNode]) -> None:
        """
        Solve the problem in-place.  Do not return anything, modify root in-place instead.
        """
        if root is None:
            return

        def dfs(node: TreeNode) -> Optional[TreeNode]:
            if node is None:
                return

            if node.left is None and node.right is None:
                return node

            left_tail = dfs(node.left)
            right_tail = dfs(node.right)

            if left_tail is not None:
                left_tail.right = node.right
                node.right = node.left
                node.left = None

            return right_tail if right_tail is not None else left_tail

        dfs(root)
