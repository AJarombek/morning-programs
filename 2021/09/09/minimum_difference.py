"""
https://leetcode.com/problems/minimum-absolute-difference-in-bst/
Author: Andrew Jarombek
Date: 9/9/2021
"""

import math
from typing import Optional


class TreeNode:
    def __init__(self, x, left=None, right=None):
        self.val = x
        self.left = left
        self.right = right


class Solution:
    minimum = None
    previous = None

    def get_minimum_difference(self, root: Optional[TreeNode]) -> int:
        self.minimum = math.inf
        self.previous = None
        self.search(root)
        return self.minimum

    def search(self, root: Optional[TreeNode]) -> None:
        if root.left is not None:
            self.search(root.left)

        if self.previous is not None:
            self.minimum = min(self.minimum, abs(root.val - self.previous))

        self.previous = root.val

        if root.right is not None:
            self.search(root.right)


if __name__ == '__main__':
    solution = Solution()
    assert solution.get_minimum_difference(TreeNode(3, TreeNode(2), TreeNode(1))) == 1
