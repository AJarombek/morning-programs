"""
https://leetcode.com/problems/triangle/
Author: Andrew Jarombek
Date: 10/10/2023
"""

from typing import List


class Solution:
    @staticmethod
    def minimum_total(triangle: List[List[int]]) -> int:
        shortest = [triangle[0]]

        for index, row in enumerate(triangle[1:]):
            row_shortest = []

            for i in range(index + 2):
                if i == 0:
                    row_shortest.append(row[i] + shortest[-1][0])
                elif i == index + 1:
                    row_shortest.append(row[i] + shortest[-1][i - 1])
                else:
                    row_shortest.append(row[i] + min(shortest[-1][i - 1], shortest[-1][i]))

            shortest.append(row_shortest)

        return min(shortest[-1])
