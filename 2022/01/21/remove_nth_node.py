"""
https://leetcode.com/problems/remove-nth-node-from-end-of-list/
Author: Andrew Jarombek
Date: 1/21/2022
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def remove_nth_from_end(head: Optional[ListNode], n: int) -> Optional[ListNode]:
    count = 0
    node = head

    while node is not None:
        count += 1
        node = node.next

    removal = count - n
    index = 0
    node = head

    if removal == 0:
        return head.next

    while index < removal - 1:
        node = node.next
        index += 1

    node.next = node.next.next

    return head
