"""
https://leetcode.com/problems/insertion-sort-list/
Author: Andrew Jarombek
Date: 10/24/2023
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    @staticmethod
    def insertion_sort_list(head: ListNode | None) -> ListNode | None:
        if head is None:
            return None

        sorted_head = ListNode(head.val)
        head = head.next

        while head is not None:
            sorted_head = Solution.insert(sorted_head, head.val)
            head = head.next

        return sorted_head

    @staticmethod
    def insert(head: ListNode, val: int) -> ListNode:
        if head is None:
            return ListNode(val)

        if val <= head.val:
            return ListNode(val, head)

        head.next = Solution.insert(head.next, val)
        return head
