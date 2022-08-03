"""
https://leetcode.com/problems/find-the-difference-of-two-arrays/
Author: Andrew Jarombek
Date: 8/2/2022
"""

from typing import List, Set


def find_difference(nums1: List[int], nums2: List[int]) -> List[Set[int]]:
    set1 = set(nums1)
    set2 = set(nums2)

    return [set1 - set2, set2 - set1]


if __name__ == '__main__':
    result = find_difference([1, 2, 3, 3], [1, 1, 2, 2])
    assert result[0] == {3}
    assert len(result[1]) == 0
