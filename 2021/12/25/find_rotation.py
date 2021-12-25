"""
https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
Author: Andrew Jarombek
Date: 12/25/2021
"""

import math
from typing import List


def find_rotation(mat: List[List[int]], target: List[List[int]]) -> bool:
    for i in range(math.ceil(len(mat) / 2)):
        source_list = []
        target_list = []

        for j in range(i, len(mat) - i):
            source_list.append(str(mat[i][j]))
            target_list.append(str(target[i][j]))

        for j in range(i, len(mat) - i):
            source_list.append(str(mat[j][len(mat) - i - 1]))
            target_list.append(str(target[j][len(mat) - i - 1]))

        for j in range(i, len(mat) - i):
            source_list.append(str(mat[len(mat) - i - 1][len(mat) - j - 1]))
            target_list.append(str(target[len(mat) - i - 1][len(mat) - j - 1]))

        for j in range(i, len(mat) - i):
            source_list.append(str(mat[len(mat) - j - 1][i]))
            target_list.append(str(target[len(mat) - j - 1][i]))

        source = "".join(source_list)
        target_str = "".join(target_list)

        if target_str not in source + source:
            return False

    return True
