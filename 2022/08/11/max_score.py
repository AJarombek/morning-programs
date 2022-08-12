"""
https://leetcode.com/problems/maximum-score-after-splitting-a-string/
Author: Andrew Jarombek
Date: 8/11/2022
"""


def max_score(s: str) -> int:
    right_count = [0, 0]
    left_count = [0, 0]
    result = 0

    for c in s:
        right_count[int(c)] += 1

    for c in s[:-1]:
        index = int(c)
        left_count[index] += 1
        right_count[index] -= 1

        result = max(result, left_count[0] + right_count[1])

    return result


if __name__ == '__main__':
    assert max_score("11000") == 2
