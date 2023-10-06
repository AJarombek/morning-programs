"""
Unit tests for the binary-tree-level-order-traversal-ii program.
Author: Andrew Jarombek
Date: 10/5/2023
"""

from program import ListNode, Solution


from typing import List, Optional

class TestSolution:
    @staticmethod
    def create_linked_list(values: List[int]) -> Optional[ListNode]:
        if not values:
            return None
        head = ListNode(values[0])
        current = head
        for value in values[1:]:
            current.next = ListNode(value)
            current = current.next
        return head

    def test_sorted_list_to_bst_empty_list(self):
        # Test when the input linked list is empty
        solution = Solution()
        result = solution.sorted_list_to_bst(None)
        assert result is None

    def test_sorted_list_to_bst_single_element(self):
        # Test when the input linked list has a single element
        solution = Solution()
        linked_list = self.create_linked_list([1])
        result = solution.sorted_list_to_bst(linked_list)
        assert result.val == 1
        assert result.left is None
        assert result.right is None
