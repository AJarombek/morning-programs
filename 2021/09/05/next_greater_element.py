"""
https://leetcode.com/problems/next-greater-element-i/
Author: Andrew Jarombek
Date: 9/5/2021
"""

# Back home

from typing import List


def next_greater_element(nums1: List[int], nums2: List[int]) -> List[int]:
    locations = {key: index for index, key in enumerate(nums2)}
    result = []

    for num in nums1:
        found = False

        for i in range(locations[num], len(nums2)):
            if nums2[i] > num:
                result.append(nums2[i])
                found = True
                break

        if not found:
            result.append(-1)

    return result


if __name__ == '__main__':
    assert next_greater_element([4, 1, 2], [1, 3, 4, 2]) == [-1, 3, -1]
