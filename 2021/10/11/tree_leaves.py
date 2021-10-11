"""
https://leetcode.com/problems/leaf-similar-trees/
Author: Andrew Jarombek
Date: 10/11/2021
"""

from typing import Optional, List


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class TreeLeaves:
    def leaf_similar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        sequence1 = []
        sequence2 = []

        self.dfs(root1, sequence1)
        self.dfs(root2, sequence2)

        return sequence1 == sequence2

    def dfs(self, root: Optional[TreeNode], sequence: List[int]) -> None:
        if root.left is None and root.right is None:
            sequence.append(root.val)

        if root.left is not None:
            self.dfs(root.left, sequence)

        if root.right is not None:
            self.dfs(root.right, sequence)