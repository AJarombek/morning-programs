"""
https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
Author: Andrew Jarombek
Date: 10/5/2023
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    @staticmethod
    def sorted_list_to_bst(head: Optional[ListNode]) -> Optional[TreeNode]:
        if head is None:
            return None

        values = []

        while head is not None:
            values.append(head.val)
            head = head.next

        return Solution.build_tree(values)

    @staticmethod
    def build_tree(values: list[int]) -> Optional[TreeNode]:
        if len(values) == 0:
            return None

        pivot = len(values) // 2
        root = TreeNode(values[pivot])

        if pivot > 0:
            root.left = Solution.build_tree(values[:pivot])

        if pivot < len(values) - 1:
            root.right = Solution.build_tree(values[pivot + 1:])

        return root
