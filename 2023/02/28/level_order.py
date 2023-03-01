"""
https://leetcode.com/problems/binary-tree-level-order-traversal/
Author: Andrew Jarombek
Date: 2/28/2023
"""

from collections import deque
from typing import Optional, List


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def level_order(root: Optional[TreeNode]) -> List[List[int]]:
    result = []

    if root is None:
        return result

    queue = deque([root])

    while len(queue) > 0:
        row = []
        count = len(queue)

        for _ in range(count):
            node = queue.pop()
            row.append(node.val)

            if node.left is not None:
                queue.appendleft(node.left)

            if node.right is not None:
                queue.appendleft(node.right)

        result.append(row)

    return result
