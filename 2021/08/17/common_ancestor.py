"""
Problem: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
Author: Andrew Jarombek
Date: 8/17/2021
"""


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


def lowest_common_ancestor(self, root: TreeNode, p: TreeNode, q: TreeNode) -> TreeNode:
    min_val = min(p.val, q.val)
    max_val = max(p.val, q.val)
    return self.searchTree(root, min_val, max_val)


def search_tree(self, root: TreeNode, min_val: int, max_val: int) -> TreeNode:
    if root.val >= min_val and root.val <= max_val:
        return root
    else:
        if root.val < min_val:
            return self.searchTree(root.right, min_val, max_val)
        else:
            return self.searchTree(root.left, min_val, max_val)