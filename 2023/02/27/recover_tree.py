"""
https://leetcode.com/problems/recover-binary-search-tree/
Author: Andrew Jarombek
Date: 2/27/2023
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def __init__(self):
        self.prev = None
        self.second = None
        self.first = None

    def recoverTree(self, root: Optional[TreeNode]) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        self.first = None
        self.second = None
        self.prev = None

        self.dfs(root)

        temp = self.first.val
        self.first.val = self.second.val
        self.second.val = temp

    def dfs(self, node: Optional[TreeNode]) -> None:
        if node.left is not None:
            self.dfs(node.left)

        if self.prev is not None and self.first is None and self.prev.val > node.val:
            self.first = self.prev

        if self.first is not None and self.prev.val > node.val:
            self.second = node

        self.prev = node

        if node.right is not None:
            self.dfs(node.right)
