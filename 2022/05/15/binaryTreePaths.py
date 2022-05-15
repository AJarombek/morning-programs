"""
https://leetcode.com/problems/invert-binary-tree/
Author: Andrew Jarombek
Date: 5/15/2022
"""

from typing import Optional, List


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        self.paths = []
        self.dfs(root, "", "")
        return self.paths

    def dfs(self, root: Optional[TreeNode], path: str, sep: str) -> None:
        path = f"{path}{sep}{root.val}"
        sep = "->"

        if root.left is None and root.right is None:
            self.paths.append(path)

        if root.left is not None:
            self.dfs(root.left, path, sep)

        if root.right is not None:
            self.dfs(root.right, path, sep)
