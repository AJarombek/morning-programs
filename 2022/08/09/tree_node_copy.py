"""
https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
Author: Andrew Jarombek
Date: 8/9/2022
"""


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


def get_target_copy(original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:
    if original.val == target.val:
        return cloned

    left = None
    right = None

    if original.left:
        left = get_target_copy(original.left, cloned.left, target)

    if left:
        return left

    if original.right:
        right = get_target_copy(original.right, cloned.right, target)

    return right


if __name__ == '__main__':
    tree = TreeNode(1)
    tree.left = TreeNode(2)
    tree.right = TreeNode(3)

    tree_copy = TreeNode(1)
    tree_copy.left = TreeNode(2)
    tree_copy.right = TreeNode(3)

    node = get_target_copy(tree, tree_copy, tree.left)

    assert node.val == 2
    assert node != tree.left
    assert node == tree_copy.left
