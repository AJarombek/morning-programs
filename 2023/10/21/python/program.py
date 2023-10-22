"""
https://leetcode.com/problems/reorder-list/
Author: Andrew Jarombek
Date: 10/21/2023
"""


class ListNode:
    def __init__(self, x, next=None):
        self.val = x
        self.next = next


class Solution:
    @staticmethod
    def reorder_list(head: ListNode | None) -> None:
        if head is None:
            return

        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next if fast.next is not None else None

        second_half = slow.next
        slow.next = None

        second_half = Solution.reverse_list(second_half)
        first_half = head

        while second_half is not None:
            temp_second = second_half.next
            temp_first = first_half.next

            first_half.next = second_half
            second_half.next = temp_first

            first_half = temp_first
            second_half = temp_second

    @staticmethod
    def reverse_list(head: ListNode | None) -> ListNode | None:
        if head is None:
            return None

        prev = None
        curr = head

        while curr is not None:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev
