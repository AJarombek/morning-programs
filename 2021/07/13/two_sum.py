"""
Problem: https://leetcode.com/problems/two-sum/
Result:  My solution was slow O(n^2), although it didnt take up much memory O(1).  Faster solutions utilized hash maps
(dictionaries in Python) to speed things up to O(n).
Author: Andrew Jarombek
Date: 7/13/2021
"""


def two_sum(nums, target):
    for index1, item1 in enumerate(nums):
        for index2, item2 in enumerate(nums[index1 + 1:]):
            if item1 + item2 == target:
                return [index1, index1 + 1 + index2]


if __name__ == '__main__':
    numbers = [2, 7, 11, 15]
    target_value = 9

    assert two_sum(numbers, target_value) == [0, 1]
