"""
https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
Author: Andrew Jarombek
Date: 12/27/2021
"""

from typing import List


def max_product_difference(nums: List[int]) -> int:
    largest = max(nums[0], nums[1])
    smallest = min(nums[0], nums[1])
    maximum = largest * smallest
    minimum = maximum

    for i in range(2, len(nums)):
        maximum = max(maximum, nums[i] * largest)
        minimum = min(minimum, nums[i] * smallest)

        smallest = min(smallest, nums[i])
        largest = max(largest, nums[i])

    return maximum - minimum
