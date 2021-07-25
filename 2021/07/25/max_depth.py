"""
https://leetcode.com/problems/maximum-depth-of-binary-tree/
Author: Andrew Jarombek
Date: 7/25/2021
"""


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def max_depth(root: TreeNode) -> int:
    if root is not None:
        return 1 + max(max_depth(root.left), max_depth(root.right))
    else:
        return 0


if __name__ == '__main__':
    assert max_depth(TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(2, TreeNode(5)))) == 3
    assert max_depth(TreeNode(1)) == 1
