"""
https://leetcode.com/problems/relative-ranks/
Author: Andrew Jarombek
Date: 9/7/2021
"""

from typing import List


def find_relative_ranks(score: List[int]) -> List[str]:
    ordered_score = [(s, index) for index, s in enumerate(score)]
    ordered_score.sort(key=lambda x: x[0], reverse=True)

    result = list(range(len(score)))

    for index, (s, i) in enumerate(ordered_score):
        if index == 0:
            val = "Gold Medal"
        elif index == 1:
            val = "Silver Medal"
        elif index == 2:
            val = "Bronze Medal"
        else:
            val = str(index + 1)

        result[i] = val

    return result


if __name__ == '__main__':
    assert find_relative_ranks([5, 4, 3, 2, 1]) == ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
