"""
https://leetcode.com/problems/swap-nodes-in-pairs/
Author: Andrew Jarombek
Date: 1/22/2022
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def swap_pairs(head: Optional[ListNode]) -> Optional[ListNode]:
    if head is None:
        return None

    node = head
    prev = None

    while node is not None and node.next is not None:
        next_node = node.next.next
        swapped_node = node.next
        node.next.next = node
        node.next = next_node

        if prev:
            prev.next = swapped_node
        else:
            head = swapped_node

        prev = node
        node = next_node

    return head
