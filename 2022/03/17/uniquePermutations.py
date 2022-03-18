"""
https://leetcode.com/problems/permutations-ii/
Author: Andrew Jarombek
Date: 3/17/2022
"""

from typing import List


def permute_unique(nums: List[int]) -> List[List[int]]:
    perms = [[nums[0]]]

    for num in nums[1:]:
        new_perms = []
        perm_set = set()

        for perm in perms:
            for loc in range(len(perm) + 1):
                new_perm = []

                for i in range(0, loc):
                    new_perm.append(perm[i])

                new_perm.append(num)

                for i in range(loc, len(perm)):
                    new_perm.append(perm[i])

                new_perm_str = str(new_perm)

                if new_perm_str not in perm_set:
                    perm_set.add(new_perm_str)
                    new_perms.append(new_perm)

        perms = new_perms

    return perms
