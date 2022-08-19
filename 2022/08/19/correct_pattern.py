"""
https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/
Author: Andrew Jarombek
Date: 8/19/2022
"""

from typing import List


def contains_pattern(arr: List[int], m: int, k: int) -> bool:
    index = 0

    while index < len(arr) - m * k + 1:
        mismatch = False

        for offset in range(m):
            val = arr[index + offset]

            for item in range(1, k):
                if val != arr[index + offset + item * m]:
                    mismatch = True
                    break

            if mismatch:
                break

        if not mismatch:
            return True

        index += 1

    return False


if __name__ == '__main__':
    assert contains_pattern([1, 2, 4, 4, 4, 4], 1, 3)
    assert contains_pattern([1, 2, 1, 2, 1, 1, 1, 3], 2, 2)
    assert not contains_pattern([1, 2, 1, 2, 1, 3], 2, 3)
