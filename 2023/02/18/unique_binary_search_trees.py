"""
https://leetcode.com/problems/unique-binary-search-trees-ii/
Author: Andrew Jarombek
Date: 2/18/2023
"""

from typing import Optional, List


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def generate_trees(self, n: int) -> List[Optional[TreeNode]]:
        return self.generate_tree_list(1, n)

    def generate_tree_list(self, start: int, end: int) -> List[Optional[TreeNode]]:
        result = []

        for i in range(start, end + 1):
            left_trees = self.generate_tree_list(start, i - 1)
            right_trees = self.generate_tree_list(i + 1, end)

            for left_tree in left_trees:
                for right_tree in right_trees:
                    node = TreeNode(i)
                    node.left = left_tree
                    node.right = right_tree
                    result.append(node)

        if len(result) == 0:
            return [None]

        return result


if __name__ == '__main__':
    solution = Solution()
    assert len(solution.generate_trees(3)) == 5
    assert len(solution.generate_trees(1)) == 1
