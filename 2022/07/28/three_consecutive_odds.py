"""
https://leetcode.com/problems/three-consecutive-odds/
Author: Andrew Jarombek
Date: 7/28/2022
"""

from typing import List


def three_consecutive_odds(arr: List[int]) -> bool:
    odds = 0

    for num in arr:
        if num % 2 == 1:
            odds += 1
        else:
            odds = 0

        if odds == 3:
            return True

    return False


if __name__ == '__main__':
    assert not three_consecutive_odds([2, 6, 4, 1])
    assert three_consecutive_odds([3, 7, 5, 2])
