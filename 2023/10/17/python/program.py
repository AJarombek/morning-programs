"""
https://leetcode.com/problems/single-number-ii/
Author: Andrew Jarombek
Date: 10/17/2023
"""


class Solution:
    @staticmethod
    def single_number(nums: list[int]) -> int:
        ones = 0
        twos = 0

        for num in nums:
            # Update the 'ones' variable:
            # - XOR operation (^) helps to keep track of the bits that appear once.
            # - The '& ~twos' operation ensures that we don't count bits that have appeared twice.
            ones = (ones ^ num) & ~twos

            # Update the 'twos' variable:
            # - XOR operation (^) helps to keep track of the bits that appear twice.
            # - The '& ~ones' operation ensures that we don't count bits that have appeared once.
            twos = (twos ^ num) & ~ones

        # After iterating through the list, the 'ones' variable will hold the single number.
        return ones
