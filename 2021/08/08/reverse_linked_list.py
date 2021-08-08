"""
Problem: https://leetcode.com/problems/reverse-linked-list/
Author: Andrew Jarombek
Date: 8/8/2021
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def reverse_list(head: Optional[ListNode]) -> Optional[ListNode]:
    if head is None:
        return None

    new_head = ListNode(head.val, None)
    head = head.next

    while head is not None:
        new_head = ListNode(head.val, new_head)
        head = head.next

    return new_head
