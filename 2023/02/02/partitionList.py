"""
https://leetcode.com/problems/partition-list/
Author: Andrew Jarombek
Date: 2/2/2023
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    @staticmethod
    def partition(head: Optional[ListNode], x: int) -> Optional[ListNode]:
        small = None
        large = None

        small_head = None
        large_head = None

        while head:
            if head.val < x:
                if small is None:
                    small = head
                    head = head.next
                    small.next = None
                    small_head = small
                else:
                    small.next = head
                    head = head.next
                    small = small.next
                    small.next = None
            else:
                if large is None:
                    large = head
                    head = head.next
                    large.next = None
                    large_head = large
                else:
                    large.next = head
                    head = head.next
                    large = large.next
                    large.next = None

        if small_head is None:
            return large_head

        small.next = large_head

        return small_head


if __name__ == '__main__':
    linked_list = ListNode(1, ListNode(4, ListNode(3, ListNode(2, ListNode(5, ListNode(2))))))
    Solution.partition(linked_list, 3)

    assert linked_list.val == 1
    assert linked_list.next.val == 2
    assert linked_list.next.next.val == 2
    assert linked_list.next.next.next.val == 4
    assert linked_list.next.next.next.next.val == 3
    assert linked_list.next.next.next.next.next.val == 5
