"""
https://leetcode.com/problems/merge-two-sorted-lists/
Author: Andrew Jarombek
Date: 7/17/2021
"""

# Now going to Long Island for the night


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def merge_two_lists(l1: ListNode, l2: ListNode) -> ListNode:
    if l1.val > l2.val:
        result = ListNode(val=l2.val)
        current = result
        l2 = l2.next
    else:
        result = ListNode(val=l1.val)
        current = result
        l1 = l1.next

    while l1 is not None or l2 is not None:
        if l1 is None and l2 is not None:
            current.next = ListNode(val=l2.val)
            current = current.next
            l2 = l2.next
        elif l2 is None and l1 is not None:
            current.next = ListNode(val=l1.val)
            current = current.next
            l1 = l1.next
        elif l1.val > l2.val:
            current.next = ListNode(val=l2.val)
            current = current.next
            l2 = l2.next
        else:
            current.next = ListNode(val=l1.val)
            current = current.next
            l1 = l1.next

    return result


if __name__ == '__main__':
    list1 = ListNode(val=1, next=ListNode(val=2, next=ListNode(val=4, next=None)))
    list2 = ListNode(val=1, next=ListNode(val=3, next=ListNode(val=4, next=None)))

    result_list = merge_two_lists(list1, list2)
    assert result_list.val == 1
    assert result_list.next.val == 1
    assert result_list.next.next.val == 2
    assert result_list.next.next.next.val == 3
    assert result_list.next.next.next.next.val == 4
    assert result_list.next.next.next.next.next.val == 4
