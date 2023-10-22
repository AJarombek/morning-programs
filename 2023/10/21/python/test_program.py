"""
Unit tests for the reorder-list program.
Author: Andrew Jarombek
Date: 10/21/2023
"""

from program import Solution, ListNode


def test_reorder_list():
    node_list = ListNode(1, next=ListNode(2, next=ListNode(3, next=ListNode(4, next=ListNode(5)))))

    Solution.reorder_list(node_list)

    assert node_list.val == 1
    assert node_list.next.val == 5
    assert node_list.next.next.val == 2
    assert node_list.next.next.next.val == 4
    assert node_list.next.next.next.next.val == 3
    assert node_list.next.next.next.next.next is None
