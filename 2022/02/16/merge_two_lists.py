"""
https://leetcode.com/problems/merge-two-sorted-lists/
Author: Andrew Jarombek
Date: 2/16/2022
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def merge_two_lists(list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
    if list1 is None and list2 is None:
        return None

    result = ListNode(0)
    current = result

    while list1 is not None and list2 is not None:
        if list1.val < list2.val:
            current.next = ListNode(list1.val)
            list1 = list1.next
        else:
            current.next = ListNode(list2.val)
            list2 = list2.next

        current = current.next

    while list1 is not None:
        current.next = ListNode(list1.val)
        current = current.next
        list1 = list1.next

    while list2 is not None:
        current.next = ListNode(list2.val)
        current = current.next
        list2 = list2.next

    return result.next
