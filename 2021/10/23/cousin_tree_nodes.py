"""
https://leetcode.com/problems/cousins-in-binary-tree/
Author: Andrew Jarombek
Date: 10/23/2021
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def cousins(root: Optional[TreeNode], x: int, y: int) -> bool:
    x_depth = None
    y_depth = None

    x_parent = None
    y_parent = None

    index = 0
    nodes = [(root, 1, None)]

    while not x_depth or not y_depth:
        node, depth, parent = nodes[index]

        if node.val == x:
            x_depth = depth
            x_parent = parent
        elif node.val == y:
            y_depth = depth
            y_parent = parent

        if node.left:
            nodes.append((node.left, depth + 1, node.val))

        if node.right:
            nodes.append((node.right, depth + 1, node.val))

        index += 1

    return x_depth == y_depth and x_parent != y_parent
