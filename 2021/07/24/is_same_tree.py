"""
https://leetcode.com/problems/same-tree/
Author: Andrew Jarombek
Date: 7/24/2021
"""


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def is_same_tree(p: TreeNode, q: TreeNode) -> bool:
    p_stack = []
    q_stack = []

    current_p = p
    current_q = q

    while current_p is not None or current_q is not None or len(p_stack) > 0 or len(q_stack) > 0:
        if current_p is None and current_q is not None:
            return False

        if current_p is not None and current_q is None:
            return False

        if current_p is None:
            current_p = p_stack.pop()
            current_q = q_stack.pop()
        elif current_p.val != current_q.val:
            return False
        else:
            p_stack.append(current_p.right)
            q_stack.append(current_q.right)

            current_p = current_p.left
            current_q = current_q.left

    return True


if __name__ == '__main__':
    assert is_same_tree(TreeNode(1, TreeNode(2), TreeNode(3)), TreeNode(1, TreeNode(2), TreeNode(3)))
    assert not is_same_tree(TreeNode(1, TreeNode(2), TreeNode(3)), TreeNode(1, TreeNode(3), TreeNode(2)))
