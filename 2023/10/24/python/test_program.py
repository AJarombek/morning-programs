"""
Unit tests for the insertion-sort-list program.
Author: Andrew Jarombek
Date: 10/24/2023
"""

from program import Solution, ListNode


def test_insertion_sort_list():
    head = ListNode(4, ListNode(2, ListNode(1, ListNode(3))))
    result = Solution.insertion_sort_list(head)
    assert result.val == 1
    assert result.next.val == 2
    assert result.next.next.val == 3
    assert result.next.next.next.val == 4
