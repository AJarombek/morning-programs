"""
https://leetcode.com/problems/richest-customer-wealth/
Author: Andrew Jarombek
Date: 8/25/2022
"""

from typing import List


def maximum_wealth(accounts: List[List[int]]) -> int:
    wealth = [sum(account) for account in accounts]
    return max(wealth)


def maximum_wealth_v2(accounts: List[List[int]]) -> int:
    """
    Interestingly, this one line result is slower and takes up more memory
    than the maximum_wealth() function above.
    """
    return max([sum(account) for account in accounts])


if __name__ == '__main__':
    assert maximum_wealth([[1, 2, 3], [3, 2, 1]]) == 6
    assert maximum_wealth([[1, 5], [7, 3], [3, 5]]) == 10
    assert maximum_wealth([[2, 8, 7], [7, 1, 3], [1, 9, 5]]) == 17
