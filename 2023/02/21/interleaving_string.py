"""
https://leetcode.com/problems/interleaving-string/
Author: Andrew Jarombek
Date: 2/21/2023
"""


class Solution:
    def __init__(self):
        self.memo = None

    def is_interleave(self, s1: str, s2: str, s3: str) -> bool:
        if len(s1) + len(s2) != len(s3):
            return False

        self.memo = {}

        return self.interleave(s1, s2, s3)

    def interleave(self, s1: str, s2: str, s3: str) -> bool:
        if len(s3) == 0:
            return True

        memo_result = self.memo.get((s1, s2))

        if memo_result is not None:
            return memo_result

        valid1 = False
        valid2 = False

        if len(s1) > 0 and s1[0] == s3[0]:
            valid1 = self.interleave(s1[1:], s2, s3[1:])

        if len(s2) > 0 and s2[0] == s3[0]:
            valid2 = self.interleave(s1, s2[1:], s3[1:])

        result = valid1 or valid2
        self.memo[(s1, s2)] = result
        return result


if __name__ == '__main__':
    solution = Solution()
    assert solution.is_interleave("aabcc", "dbbca", "aadbbcbcac")
