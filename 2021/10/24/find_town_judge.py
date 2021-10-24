"""
https://leetcode.com/problems/find-the-town-judge/
Author: Andrew Jarombek
Date: 10/24/2021
"""

from typing import List


def find_judge(n: int, trust: List[List[int]]) -> int:
    if n == 1:
        return 1

    town_members = set(range(1, n + 1))
    trust_dict = {}

    for item in trust:
        town_members.discard(item[0])

        if trust_dict.get(item[1]) is None:
            trust_dict[item[1]] = 1
        else:
            trust_dict[item[1]] = trust_dict[item[1]] + 1

    if len(town_members) != 1:
        return -1

    judge = town_members.pop()

    if trust_dict.get(judge) == n - 1:
        return judge
    else:
        return -1
