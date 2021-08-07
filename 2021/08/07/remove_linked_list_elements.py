"""
Problem: https://leetcode.com/problems/reverse-bits/
Author: Andrew Jarombek
Date: 8/6/2021
"""

# Ran 1:16:19 Half-Marathon.  Super tired and stomach isn't happy with me now, but happy with the race.

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def remove_elements(head: Optional[ListNode], val: int) -> Optional[ListNode]:
    if head is None:
        return None

    new_head = head
    current = head
    previous = None

    while current is not None:
        if current.val == val:
            if previous is None:
                new_head = current.next
                current = new_head
            else:
                previous.next = current.next
                current = current.next
        else:
            previous = current
            current = current.next

    return new_head
