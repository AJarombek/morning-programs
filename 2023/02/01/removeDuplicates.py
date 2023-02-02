"""
https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
Author: Andrew Jarombek
Date: 2/1/2023
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    @staticmethod
    def delete_duplicates(head: Optional[ListNode]) -> Optional[ListNode]:
        while head is not None and head.next is not None and head.next.val == head.val:
            val = head.val

            while head is not None and head.val == val:
                head = head.next

        result = head

        if result is None:
            return None

        prev = head
        node = head.next

        while node is not None:
            if node.next is not None and node.next.val == node.val:
                val = node.val

                while node is not None and node.val == val:
                    node = node.next

                prev.next = node
            else:
                prev = node
                node = node.next

        return head


if __name__ == '__main__':
    linked_list = ListNode(1, ListNode(1, ListNode(1, ListNode(2, ListNode(3)))))
    result_list = Solution.delete_duplicates(linked_list)
    assert result_list.val == 2
    assert result_list.next.val == 3
    assert result_list.next.next is None
