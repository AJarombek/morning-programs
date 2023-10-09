"""
https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
Author: Andrew Jarombek
Date: 10/8/2023
"""

from typing import Optional


class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next


class Solution:
    @staticmethod
    def connect(root: Optional[Node]) -> Optional[Node]:
        if root is None:
            return None

        queue = [root]

        while len(queue) > 0:
            next_queue = []

            for i, node in enumerate(queue):
                if i < len(queue) - 1:
                    node.next = queue[i + 1]

                if node.left is not None:
                    next_queue.append(node.left)

                if node.right is not None:
                    next_queue.append(node.right)

            queue = next_queue

        return root
