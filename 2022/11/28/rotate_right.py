"""
https://leetcode.com/problems/rotate-list/
Author: Andrew Jarombek
Date: 11/28/2022
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def rotate_right(head: Optional[ListNode], k: int) -> Optional[ListNode]:
    if not head:
        return head

    node = head
    count = 1

    while node.next:
        node = node.next
        count += 1

    for _ in range(count - (k % count)):
        node.next = head
        head = head.next
        node = node.next
        node.next = None

    return head


if __name__ == '__main__':
    node = ListNode(0, ListNode(1, ListNode(2)))
    result = rotate_right(node, 4)

    assert result.val == 2
    assert result.next.val == 0
    assert result.next.next.val == 1
    assert result.next.next.next is None
