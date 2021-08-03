"""
https://leetcode.com/problems/intersection-of-two-linked-lists/
Author: Andrew Jarombek
Date: 8/3/2021
"""


from typing import Optional


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def get_intersection_node(head_a: ListNode, head_b: ListNode) -> Optional[ListNode]:
    nodes_a = set()

    while head_a is not None:
        nodes_a.add(id(head_a))
        head_a = head_a.next

    while head_b is not None:
        if id(head_b) in nodes_a:
            return head_b

        head_b = head_b.next

    return None
