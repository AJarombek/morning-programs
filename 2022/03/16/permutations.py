"""
https://leetcode.com/problems/permutations/
Author: Andrew Jarombek

None since 12/2016
"""

from typing import List


def permute(nums: List[int]) -> List[List[int]]:
    perms = [[nums[0]]]

    for num in nums[1:]:
        new_perms = []

        for perm in perms:
            for loc in range(len(perm) + 1):
                new_perm = []

                for i in range(0, loc):
                    new_perm.append(perm[i])

                new_perm.append(num)

                for i in range(loc, len(perm)):
                    new_perm.append(perm[i])

                new_perms.append(new_perm)

        perms = new_perms

    return perms
