"""
https://leetcode.com/problems/balanced-binary-tree/
Author: Andrew Jarombek
Date: 7/27/2021
"""

# You are not mean, not even slightly.  I just wish you could trust me to be there for you again if you wanted me to be.


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def is_balanced(root: TreeNode) -> bool:
    balanced, height = check_balanced(root)
    return balanced


def check_balanced(root: TreeNode) -> (bool, int):
    if root is None:
        return True, 0
    else:
        left_balanced, left_height = check_balanced(root.left)
        right_balanced, right_height = check_balanced(root.right)

        if not left_balanced or not right_balanced:
            return False, 0
        elif abs(left_height - right_height) <= 1:
            return True, 1 + max(left_height, right_height)
        else:
            return False, 0


if __name__ == '__main__':
    assert is_balanced(TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(2, TreeNode(5), TreeNode(4))))
    assert not is_balanced(TreeNode(1, TreeNode(2, TreeNode(5), TreeNode(4)), None))
