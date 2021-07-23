"""
https://leetcode.com/problems/merge-sorted-array/
Author: Andrew Jarombek
Date: 7/23/2021
"""

from typing import List


def merge(nums1: List[int], m: int, nums2: List[int], n: int) -> None:
    while m > 0 and n > 0:
        x = nums1[m - 1]
        y = nums2[n - 1]

        if x > y:
            nums1[m + n - 1] = x
            m = m - 1
        else:
            nums1[m + n - 1] = y
            n = n - 1

    while n > 0:
        nums1[n - 1] = nums2[n - 1]
        n = n - 1


if __name__ == '__main__':
    list1 = [1, 2, 3, 0, 0, 0]
    merge(list1, 3, [2, 5, 6], 3)

    assert list1 == [1, 2, 2, 3, 5, 6]
