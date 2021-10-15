"""
https://leetcode.com/problems/increasing-order-search-tree/
Author: Andrew Jarombek
Date: 10/14/2021
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def increasing_bst(self, root: TreeNode) -> Optional[TreeNode]:
        self.new_tree_start = None
        self.new_tree_end = None

        self.dfs(root)

        return self.new_tree_start

    def dfs(self, root: TreeNode) -> None:
        if root.left is not None:
            self.dfs(root.left)

        if self.new_tree_start is None:
            self.new_tree_start = TreeNode(root.val)
            self.new_tree_end = self.new_tree_start
        else:
            self.new_tree_end.right = TreeNode(root.val)
            self.new_tree_end = self.new_tree_end.right

        if root.right is not None:
            self.dfs(root.right)
