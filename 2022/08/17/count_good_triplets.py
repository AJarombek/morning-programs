"""
https://leetcode.com/problems/count-good-triplets/
Author: Andrew Jarombek
Date: 8/17/2022
"""

from typing import List


def count_good_triplets(arr: List[int], a: int, b: int, c: int) -> int:
    result = 0

    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            for k in range(j + 1, len(arr)):
                val_i = arr[i]
                val_j = arr[j]
                val_k = arr[k]

                if all((
                        abs(val_i - val_j) <= a,
                        abs(val_j - val_k) <= b,
                        abs(val_i - val_k) <= c
                )):
                    result += 1

    return result


if __name__ == '__main__':
    assert count_good_triplets([3, 0, 1, 1, 9, 7], 7, 2, 3) == 4
    assert count_good_triplets([1, 1, 2, 2, 3], 0, 0, 1) == 0
