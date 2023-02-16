"""
https://leetcode.com/problems/reverse-linked-list-ii/
Author: Andrew Jarombek
Date: 2/15/2023
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    @staticmethod
    def reverse_between(head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        i = 1

        if left == 1:
            new_head = ListNode(0, head)
            head = new_head
            i = 0

        node = head

        while i + 1 < left:
            node = node.next
            i += 1

        slice_head = node
        node = node.next

        slice_next = node
        slice_tail = node

        node = node.next
        i += 2

        while i <= right:
            next_node = node.next
            node.next = slice_next
            slice_head.next = node

            slice_next = node
            node = next_node
            i += 1

        slice_tail.next = node

        if left == 1:
            return head.next

        return head
