"""
https://leetcode.com/problems/unique-binary-search-trees/
Author: Andrew Jarombek
Date: 2/20/2023
"""


class Solution:
    def __init__(self):
        self.memo = None

    def numTrees(self, n: int) -> int:
        self.memo = {}
        return self.buildTrees(1, n)

    def buildTrees(self, start: int, end: int) -> int:
        if start > end:
            return 1

        if (start, end) in self.memo:
            return self.memo[(start, end)]

        result = 0

        for i in range(start, end + 1):
            left_trees = self.buildTrees(start, i - 1)
            right_trees = self.buildTrees(i + 1, end)
            result += left_trees * right_trees

        self.memo[(start, end)] = result
        return result


if __name__ == '__main__':
    solution = Solution()
    assert solution.numTrees(1) == 1
    assert solution.numTrees(2) == 2
    assert solution.numTrees(3) == 5
