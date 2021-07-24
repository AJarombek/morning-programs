"""
https://leetcode.com/problems/binary-tree-inorder-traversal/
Author: Andrew Jarombek
Date: 7/24/2021
"""

from typing import List


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def in_order_traversal(root: TreeNode) -> List[int]:
    result = []

    if root is None:
        return result

    if root.left:
        result += in_order_traversal(root.left)

    result.append(root.val)

    if root.right:
        result += in_order_traversal(root.right)

    return result


if __name__ == '__main__':
    assert in_order_traversal(TreeNode(2, TreeNode(1), None)) == [1, 2]
