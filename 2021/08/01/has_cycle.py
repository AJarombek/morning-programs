"""
https://leetcode.com/problems/linked-list-cycle
Author: Andrew Jarombek
Date: 8/1/2021
"""


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def has_cycle(head: ListNode) -> bool:
    items = set()

    prev_id = None

    while head is not None:
        current_id = id(head)

        if current_id == prev_id:
            return False

        if current_id in items:
            return True

        items.add(id(head))
        head = head.next

    return False
