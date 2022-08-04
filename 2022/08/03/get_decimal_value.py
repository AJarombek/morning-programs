"""
https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
Author: Andrew Jarombek
Date: 8/3/2022
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def get_decimal_value(head: ListNode) -> int:
    value = 0

    while head is not None:
        value <<= 1
        value += head.val
        head = head.next

    return value


if __name__ == '__main__':
    assert get_decimal_value(ListNode(1, ListNode(0, ListNode(1)))) == 5
    assert get_decimal_value(ListNode(0)) == 0
