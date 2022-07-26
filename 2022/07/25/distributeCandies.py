"""
https://leetcode.com/problems/distribute-candies-to-people/
Author: Andrew Jarombek
Date: 7/25/2022
"""

from typing import List


def distribute_candies(candies: int, num_people: int) -> List[int]:
    result = []

    for _ in range(num_people):
        result.append(0)

    count = 1
    while candies > 0:
        index = (count - 1) % num_people
        result[index] = result[index] + min(count, candies)

        candies -= count
        count += 1

    return result


def distribute_candies_faster(candies: int, num_people: int) -> List[int]:
    """
    Faster and more concise, but the command "[0] * num_people" uses more memory.
    """
    result = [0] * num_people

    count = 1
    while candies > 0:
        index = (count - 1) % num_people
        result[index] = result[index] + min(count, candies)

        candies -= count
        count += 1

    return result


if __name__ == '__main__':
    assert distribute_candies(7, 4) == [1, 2, 3, 1]
    assert distribute_candies_faster(7, 4) == [1, 2, 3, 1]
