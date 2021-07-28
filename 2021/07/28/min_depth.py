"""
https://leetcode.com/problems/minimum-depth-of-binary-tree
Author: Andrew Jarombek
Date: 7/28/2021
"""


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def min_depth(root: TreeNode) -> int:
    if root is None:
        return 0

    depth = 1
    nodes = [root]

    while len(nodes) > 0:
        new_nodes = []
        for node in nodes:
            if node.left is None and node.right is None:
                return depth

            if node.left is not None:
                new_nodes.append(node.left)
            if node.right is not None:
                new_nodes.append(node.right)

        depth += 1
        nodes = new_nodes

    return depth


if __name__ == '__main__':
    assert min_depth(TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(2))) == 2
    assert min_depth(TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(2, TreeNode(5), TreeNode(4)))) == 3
