"""
https://leetcode.com/problems/remove-duplicates-from-sorted-list/
Author: Andrew Jarombek
Date: 7/23/2021
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def delete_duplicates(head: ListNode) -> Optional[ListNode]:
    if head is None:
        return None

    previous = head
    current = head.next

    while current is not None:
        if previous.val == current.val:
            current = current.next
            previous.next = current
        else:
            previous = current
            current = current.next

    return head


if __name__ == '__main__':
    result_list = delete_duplicates(head=ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(3))))))
    assert result_list.val == 1
    assert result_list.next.val == 2
    assert result_list.next.next.val == 3
    assert result_list.next.next.next is None
