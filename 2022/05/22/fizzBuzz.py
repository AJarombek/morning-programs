"""
https://leetcode.com/problems/fizz-buzz/
Author: Andrew Jarombek
Date: 5/22/2022
"""

from typing import List


def fizz_buzz(n: int) -> List[str]:
    result = []

    for i in range(1, n + 1):
        val = ""

        if i % 3 == 0:
            val += "Fizz"

        if i % 5 == 0:
            val += "Buzz"

        if len(val) == 0:
            val = f"{i}"

        result.append(val)

    return result
