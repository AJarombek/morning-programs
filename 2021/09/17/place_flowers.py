"""
https://leetcode.com/problems/can-place-flowers/
Author: Andrew Jarombek
Date: 9/17/2021
"""

from typing import List


def can_place_flowers(flowerbed: List[int], n: int) -> bool:
    if n == 0:
        return True

    if len(flowerbed) == 1:
        return flowerbed[0] == 0

    index = 0

    if flowerbed[0] == 0 and flowerbed[1] == 0:
        n -= 1
        index = 1

    while index < len(flowerbed) and n > 0:
        if flowerbed[index] == 0:
            if index + 1 != len(flowerbed) and flowerbed[index + 1] == 0:
                if index + 2 == len(flowerbed) or flowerbed[index + 2] == 0:
                    n -= 1

                index += 2
            else:
                index += 1
        else:
            index += 1

    return n == 0


if __name__ == '__main__':
    assert can_place_flowers([0, 0, 1, 0, 1], 1)
