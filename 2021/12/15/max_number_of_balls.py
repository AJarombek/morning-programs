"""
https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
Author: Andrew Jarombek
Date: 12/15/2021
"""


def count_balls(low_limit: int, high_limit: int) -> int:
    boxes = {}
    largest = 0

    for i in range(low_limit, high_limit + 1):
        box = 0
        x = i

        while x > 0:
            q, mod = divmod(x, 10)
            box += mod
            x = q

        value = boxes.get(box, 0) + 1
        boxes[box] = value

        if value > largest:
            largest = value

    return largest
