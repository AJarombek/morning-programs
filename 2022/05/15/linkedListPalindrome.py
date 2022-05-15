"""
https://leetcode.com/problems/palindrome-linked-list/
Author: Andrew Jarombek
Date: 5/15/2022
"""

import collections
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def is_palindrome(self, head: Optional[ListNode]) -> bool:
    length = 0

    node = head
    while node is not None:
        length += 1
        node = node.next

    stack = collections.deque()
    index = 0
    node = head

    while index < length // 2:
        index += 1
        stack.append(node.val)
        node = node.next

    if length % 2 == 1:
        index += 1
        node = node.next

    while index < length:
        val = stack.pop()

        if val != node.val:
            return False

        index += 1
        node = node.next

    return True
