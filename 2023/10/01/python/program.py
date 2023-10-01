"""
https://leetcode.com/problems/binary-tree-level-order-traversal/
Author: Andrew Jarombek
Date: 10/1/2023
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    @staticmethod
    def zigzag_level_order(root: Optional[TreeNode]) -> list[list[int]]:
        if not root:
            return []

        result = []
        level = 0
        queue = deque([root])

        while len(queue) > 0:
            row = []
            new_queue = deque()

            while len(queue) > 0:
                node = queue.pop()
                row.append(node.val)

                if level % 2 == 0:
                    if node.left:
                        new_queue.append(node.left)
                    if node.right:
                        new_queue.append(node.right)
                else:
                    if node.right:
                        new_queue.append(node.right)
                    if node.left:
                        new_queue.append(node.left)

            result.append(row)
            queue = new_queue
            level += 1

        return result
