"""
Problem: https://leetcode.com/problems/contains-duplicate/
Author: Andrew Jarombek
Date: 8/10/2021
"""

# If only I could show you.
# I feel like I continue to misunderstand what type of love and support you want from me though.

from typing import List


def contains_duplicate(nums: List[int]) -> bool:
    found = set()
    for num in nums:
        if num in found:
            return True
        else:
            found.add(num)

    return False
