"""
https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
Author: Andrew Jarombek
Date: 7/26/2021
"""

# You are still gone.  If you are happier out there without me I’m happy for you, even though I miss you.

from typing import Optional, List


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def sorted_array_to_bst(nums: List[int]) -> Optional[TreeNode]:
    if len(nums) == 0:
        return None
    elif len(nums) == 1:
        return TreeNode(nums[0])
    else:
        middle = len(nums) // 2
        return TreeNode(
            nums[middle],
            sorted_array_to_bst(nums[0:middle]),
            sorted_array_to_bst(nums[middle + 1:len(nums)])
        )


if __name__ == '__main__':
    bst = sorted_array_to_bst([-10, -3, 0, 5, 9])
    assert bst.val == 0
    assert bst.left.val == -3
    assert bst.right.val == 9
    assert bst.left.left.val == -10
    assert bst.right.left.val == 5
