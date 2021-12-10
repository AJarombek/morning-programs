"""
https://leetcode.com/problems/get-maximum-in-generated-array/
Author: Andrew Jarombek
Date: 12/9/2021
"""


def get_maximum_generated(n: int) -> int:
    if n < 2:
        return n

    items = [0, 1]
    maximum = 1

    for i in range(2, n + 1):
        if i % 2 == 0:
            items.append(items[i // 2])
        else:
            items.append(items[i // 2] + items[(i // 2) + 1])

        maximum = max(maximum, items[-1])

    return maximum
