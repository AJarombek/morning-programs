"""
https://leetcode.com/problems/linked-list-cycle-ii/
Author: Andrew Jarombek
Date: 10/20/2023
"""


class ListNode:
    def __init__(self, x, next=None):
        self.val = x
        self.next = next


class Solution:
    @staticmethod
    def detect_cycle(head: ListNode | None) -> ListNode | None:
        if head is None:
            return None

        slow = head
        fast = head

        while fast is not None:
            slow = slow.next
            fast = fast.next.next if fast.next is not None else None

            if slow == fast:
                break

        if fast is None:
            return None

        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow
