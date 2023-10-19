"""
Unit tests for the copy-list-with-random-pointer program.
Author: Andrew Jarombek
Date: 10/18/2023
"""

from program import Solution, Node


def test_copy_random_list():
    node_list = Node(7, next=Node(13, next=Node(11, next=Node(10, next=Node(1)))))
    node_list.random = None
    node_list.next.random = node_list
    node_list.next.next.random = node_list.next.next.next.next
    node_list.next.next.next.random = node_list.next.next
    node_list.next.next.next.next.random = node_list

    result = Solution.copy_random_list(node_list)

    assert result.val == 7
    assert result.next.val == 13
    assert result.next.next.val == 11
    assert result.next.next.next.val == 10
    assert result.next.next.next.next.val == 1

    assert result.random is None
    assert result.next.random.val == 7
    assert result.next.next.random.val == 1
    assert result.next.next.next.random.val == 11
    assert result.next.next.next.next.random.val == 7
