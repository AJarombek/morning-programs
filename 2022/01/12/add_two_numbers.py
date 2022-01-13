"""
https://leetcode.com/problems/add-two-numbers/
Author: Andrew Jarombek
Date: 1/12/2022
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def add_two_numbers(l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
    v1 = 0
    v2 = 0

    i = 0
    while l1 is not None:
        v1 += (l1.val * (10 ** i))
        i += 1
        l1 = l1.next

    i = 0
    while l2 is not None:
        v2 += (l2.val * (10 ** i))
        i += 1
        l2 = l2.next

    value = v1 + v2

    result = ListNode(val=value % 10)
    node = result
    value //= 10

    while value > 0:
        node.next = ListNode(val=value % 10)
        node = node.next
        value //= 10

    return result
