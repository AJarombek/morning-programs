"""
https://leetcode.com/problems/count-of-matches-in-tournament/
Author: Andrew Jarombek
Date: 8/26/2022
"""


def number_of_matches(n: int) -> int:
    result = 0

    while n > 1:
        m, rem = divmod(n, 2)
        result += m
        n = m + rem

    return result


def number_of_matches_v2(n: int) -> int:
    return n - 1


if __name__ == '__main__':
    assert number_of_matches(7) == 6
    assert number_of_matches(14) == 13
