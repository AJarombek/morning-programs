"""
https://leetcode.com/problems/gas-station/
Author: Andrew Jarombek
Date: 10/16/2023
"""


class Solution:
    @staticmethod
    def can_complete_circuit(gas: list[int], cost: list[int]) -> int:
        if sum(gas) < sum(cost):
            return -1

        tank = 0
        result = 0

        for i in range(len(gas)):
            tank += gas[i] - cost[i]

            if tank < 0:
                result = i + 1
                tank = 0

        return result
