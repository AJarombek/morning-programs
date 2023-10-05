"""
https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
Author: Andrew Jarombek
Date: 10/4/2023
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    @staticmethod
    def level_order_bottom(root: Optional[TreeNode]) -> list[list[int]]:
        if root is None:
            return []

        nodes = [root]
        result = []

        while len(nodes) > 0:
            next_level = []
            row = []

            for node in nodes:
                row.append(node.val)

                if node.left is not None:
                    next_level.append(node.left)

                if node.right is not None:
                    next_level.append(node.right)

            nodes = next_level
            result.append(row)

        return list(reversed(result))
