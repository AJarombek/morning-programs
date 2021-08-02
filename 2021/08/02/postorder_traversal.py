"""
https://leetcode.com/problems/binary-tree-postorder-traversal
Author: Andrew Jarombek
Date: 8/2/2021
"""

from typing import List


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def postorder_traversal(root: TreeNode) -> List[int]:
    result = []
    traversal(root, result)
    return result


def traversal(root: TreeNode, result: List[int]) -> None:
    if root is not None:
        traversal(root.left, result)
        traversal(root.right, result)
        result.append(root.val)


if __name__ == '__main__':
    tree = TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(3))
    assert postorder_traversal(tree) == [4, 5, 2, 3, 1]
