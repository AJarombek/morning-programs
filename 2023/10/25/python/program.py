"""
https://leetcode.com/problems/sort-list/
Author: Andrew Jarombek
Date: 10/25/2023
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    @staticmethod
    def sort_list(head: ListNode | None) -> ListNode | None:
        if not head or not head.next:
            return head

        middle = Solution.get_middle(head)
        next_to_middle = middle.next
        middle.next = None

        left = Solution.sort_list(head)
        right = Solution.sort_list(next_to_middle)

        return Solution.merge(left, right)

    @staticmethod
    def get_middle(head: ListNode) -> ListNode:
        if not head:
            return head

        slow = head
        fast = head

        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next

        return slow

    @staticmethod
    def merge(left: ListNode, right: ListNode) -> ListNode:
        if not left:
            return right

        if not right:
            return left

        if left.val < right.val:
            left.next = Solution.merge(left.next, right)
            return left

        right.next = Solution.merge(left, right.next)
        return right
