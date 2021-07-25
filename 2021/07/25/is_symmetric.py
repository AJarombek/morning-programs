"""
https://leetcode.com/problems/symmetric-tree
Author: Andrew Jarombek
Date: 7/25/2021
"""


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def is_symmetric(root: TreeNode) -> bool:
    left_stack = []
    right_stack = []

    left = root.left
    right = root.right

    while left is not None or right is not None or len(left_stack) > 0 or len(right_stack) > 0:
        if left is None and right is not None:
            return False
        if right is None and left is not None:
            return False

        if left is None:
            left = left_stack.pop()
            right = right_stack.pop()
        elif right.val != left.val:
            return False
        else:
            left_stack.append(left.right)
            right_stack.append(right.left)

            left = left.left
            right = right.right

    return True


if __name__ == '__main__':
    assert is_symmetric(TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(2, TreeNode(5), TreeNode(4))))
    assert not is_symmetric(TreeNode(1, TreeNode(2, TreeNode(5), TreeNode(4)), TreeNode(2, TreeNode(5), TreeNode(4))))
