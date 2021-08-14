"""
Problem: https://leetcode.com/problems/summary-ranges/
Author: Andrew Jarombek
Date: 8/14/2021
"""

from typing import List


def summary_ranges(nums: List[int]) -> List[str]:
    if len(nums) == 0:
        return []

    result = []

    start = nums[0]
    last = None

    for num in nums[1:]:
        prev = start if last is None else last

        if prev + 1 != num:
            if last is not None:
                result.append(f"{start}->{last}")
            else:
                result.append(f"{start}")

            start = num
            last = None
        else:
            last = num

    if start is not None:
        if last is not None:
            result.append(f"{start}->{last}")
        else:
            result.append(f"{start}")

    return result


if __name__ == '__main__':
    assert summary_ranges([]) == []
    assert summary_ranges([1]) == ["1"]
    assert summary_ranges([0, 2, 3, 4, 6, 8, 9]) == ["0", "2->4", "6", "8->9"]
