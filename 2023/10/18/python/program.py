"""
https://leetcode.com/problems/copy-list-with-random-pointer/
Author: Andrew Jarombek
Date: 10/18/2023
"""


class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random


class Solution:
    @staticmethod
    def copy_random_list(head: Node | None) -> Node | None:
        if head is None:
            return None

        node = head
        while node is not None:
            new_node = Node(node.val)
            new_node.next = node.next
            node.next = new_node
            node = new_node.next

        node = head
        while node is not None:
            if node.random is not None:
                node.next.random = node.random.next
            node = node.next.next

        node = head
        result = head.next

        while node is not None:
            temp = node.next
            node.next = temp.next
            if temp.next is not None:
                temp.next = temp.next.next
            node = node.next

        return result
