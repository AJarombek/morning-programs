"""
https://leetcode.com/problems/path-sum-ii/
Author: Andrew Jarombek
Date: 10/6/2023
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    @staticmethod
    def path_sum(root: Optional[TreeNode], target_sum: int) -> list[list[int]]:
        if root is None:
            return []

        paths = []

        def dfs(node: TreeNode, path: list[int], current_sum: int) -> None:
            if node.left is None and node.right is None:
                if current_sum + node.val == target_sum:
                    path.append(node.val)
                    paths.append(path)

            if node.left is not None:
                dfs(node.left, path + [node.val], current_sum + node.val)

            if node.right is not None:
                dfs(node.right, path + [node.val], current_sum + node.val)

        dfs(root, [], 0)

        return paths
