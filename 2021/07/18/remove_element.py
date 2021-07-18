"""
https://leetcode.com/problems/remove-element/
Author: Andrew Jarombek
Date: 7/18/2021
"""

from typing import List


def remove_element(nums: List[int], val: int) -> int:
    index = 0

    for i in range(len(nums)):
        if nums[i] != val:
            nums[index] = nums[i]
            index += 1

    return index


if __name__ == '__main__':
    numbers = [3, 2, 2, 3]
    result_length = remove_element(nums=numbers, val=2)

    assert result_length == 2
    assert len(numbers) == 4
    assert numbers[0] == 3
    assert numbers[1] == 3
