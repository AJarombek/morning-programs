"""
https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
Author: Andrew Jarombek
Date: 9/20/2021
"""

from typing import Optional


class TreeNode:
    def __init__(self, x, left=None, right=None):
        self.val = x
        self.left = left
        self.right = right


class TwoSumIV:
    potential_matches = set()
    match_found = False

    def find_target(self, root: Optional[TreeNode], k: int) -> bool:
        self.potential_matches = set()
        self.match_found = False

        self.find_match(root, k)

        return self.match_found

    def find_match(self, root: Optional[TreeNode], k: int) -> None:
        if root.val in self.potential_matches:
            self.match_found = True
        else:
            if k - root.val != root.val:
                self.potential_matches.add(k - root.val)

            if not self.match_found:
                if root.left is not None:
                    self.find_match(root.left, k)

                if root.right is not None:
                    self.find_match(root.right, k)