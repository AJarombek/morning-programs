"""
https://leetcode.com/problems/sum-root-to-leaf-numbers/
Author: Andrew Jarombek
Date: 10/12/2023
"""


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    @staticmethod
    def sum_numbers(root: TreeNode | None) -> int:
        if root is None:
            return 0

        return Solution.dfs(root, 0)

    @staticmethod
    def dfs(root: TreeNode, num: int) -> int:
        if root.right is None and root.left is None:
            return num * 10 + root.val

        total = 0

        if root.left is not None:
            total += Solution.dfs(root.left, num * 10 + root.val)

        if root.right is not None:
            total += Solution.dfs(root.right, num * 10 + root.val)

        return total
