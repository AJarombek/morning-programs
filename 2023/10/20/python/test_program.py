"""
Unit tests for the linked-list-cycle-ii program.
Author: Andrew Jarombek
Date: 10/20/2023
"""

from program import Solution, ListNode


def test_detect_cycle():
    node_list = ListNode(3, next=ListNode(2, next=ListNode(0, next=ListNode(-4))))
    node_list.next.next.next.next = node_list.next

    result = Solution.detect_cycle(node_list)
    assert result.val == 2
