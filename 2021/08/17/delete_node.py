"""
Problem: https://leetcode.com/problems/delete-node-in-a-linked-list/
Author: Andrew Jarombek
Date: 8/17/2021
"""


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def delete_node(node):
    prev = node

    while node.next is not None:
        node.val = node.next.val
        prev = node
        node = node.next

    prev.next = None
