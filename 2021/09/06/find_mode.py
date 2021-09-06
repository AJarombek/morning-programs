"""
https://leetcode.com/problems/find-mode-in-binary-search-tree/
Author: Andrew Jarombek
Date: 9/6/2021
"""

from typing import Optional, List


class TreeNode:
    def __init__(self, x, left=None, right=None):
        self.val = x
        self.left = left
        self.right = right


class Solution:
    mode = 0
    modes = []
    prior_value = None
    consecutive_values = 0

    def find_mode(self, root: Optional[TreeNode]) -> List[int]:
        self.search(root)

        if self.consecutive_values > self.mode:
            self.modes = [self.prior_value]
        elif self.consecutive_values == self.mode:
            self.modes.append(self.prior_value)

        return self.modes

    def search(self, root: Optional[TreeNode]) -> None:
        if root.left is not None:
            self.search(root.left)

        if root.val == self.prior_value:
            self.consecutive_values += 1
        else:
            if self.consecutive_values > self.mode:
                self.mode = self.consecutive_values
                self.modes = [self.prior_value]
            elif self.consecutive_values == self.mode:
                self.modes.append(self.prior_value)

            self.prior_value = root.val
            self.consecutive_values = 1

        if root.right is not None:
            self.search(root.right)


if __name__ == '__main__':
    solution = Solution()
    assert solution.find_mode(TreeNode(1, None, TreeNode(2, TreeNode(2), None))) == [2]
