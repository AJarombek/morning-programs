"""
https://leetcode.com/problems/n-ary-tree-preorder-traversal/
Author: Andrew Jarombek
Date: 9/29/2021
"""

from typing import List


class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children


def preorder(self, root: Node) -> List[int]:
    if root is None:
        return []

    result = [root.val]

    for child in root.children:
        if child is not None:
            result += self.preorder(child)

    return result
