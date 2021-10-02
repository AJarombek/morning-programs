"""
https://leetcode.com/problems/minimum-distance-between-bst-nodes/
Author: Andrew Jarombek
Date: 10/2/2021
"""

# If I am making a mistake or you are still feeling trapped, please help me know.
# If speaking to me in person is a danger, I don't want to mess anything up & want to be here for you in my code.
# I'm sorry, this is too important to mess up.

import math
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class MinDiffBST:
    min_diff = math.inf

    def min_diff_in_bst(self, root: Optional[TreeNode]) -> int:
        self.search(root, None)
        return self.min_diff

    def search(self, root: Optional[TreeNode], previous: Optional[int]) -> int:
        if root.left is not None:
            previous = self.search(root.left, previous)

        if previous is not None:
            self.min_diff = min(self.min_diff, root.val - previous)

        if root.right is not None:
            return self.search(root.right, root.val)
        else:
            return root.val
