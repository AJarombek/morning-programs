"""
https://leetcode.com/problems/calculate-amount-paid-in-taxes/
Author: Andrew Jarombek
Date: 7/31/2022
"""

from typing import List


def calculate_tax(brackets: List[List[int]], income: int) -> float:
    result = 0
    taxed_income = 0
    index = 0

    while taxed_income < income:
        bracket = brackets[index]

        dollars = min(bracket[0], income) - taxed_income
        result += dollars * bracket[1] / 100

        taxed_income += dollars
        index += 1

    return result


if __name__ == '__main__':
    assert calculate_tax([[3, 50], [7, 10], [12, 25]], 10) == 2.65
