"""
https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
Author: Andrew Jarombek
Date: 10/3/2023
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    @staticmethod
    def build_tree(inorder: list[int], postorder: list[int]) -> Optional[TreeNode]:
        root = TreeNode(postorder[-1])
        pivot = inorder.index(postorder[-1])

        if pivot > 0:
            root.left = Solution.build_tree(inorder[:pivot], postorder[:pivot])

        if pivot < len(inorder) - 1:
            root.right = Solution.build_tree(inorder[pivot + 1:], postorder[pivot:-1])

        return root
