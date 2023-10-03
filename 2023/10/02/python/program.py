"""
https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
Author: Andrew Jarombek
Date: 10/2/2023
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    @staticmethod
    def build_tree(preorder: list[int], inorder: list[int]) -> Optional[TreeNode]:
        root = TreeNode(preorder[0])
        pivot = inorder.index(preorder[0])

        if pivot > 0:
            root.left = Solution.build_tree(preorder[1:pivot + 1], inorder[:pivot])

        if pivot < len(inorder) - 1:
            root.right = Solution.build_tree(preorder[pivot + 1:], inorder[pivot + 1:])

        return root
