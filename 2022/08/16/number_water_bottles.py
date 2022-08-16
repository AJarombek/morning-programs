"""
https://leetcode.com/problems/water-bottles/
Author: Andrew Jarombek
Date: 8/16/2022
"""


def num_water_bottles(num_bottles: int, num_exchange: int) -> int:
    result = 0

    while num_bottles >= num_exchange:
        quotent, remainder = divmod(num_bottles, num_exchange)
        result += quotent * num_exchange
        num_bottles = quotent + remainder

    return result + num_bottles


if __name__ == '__main__':
    assert num_water_bottles(9, 3) == 13
    assert num_water_bottles(15, 4) == 19
