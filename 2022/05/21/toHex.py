"""
https://leetcode.com/problems/convert-a-number-to-hexadecimal/
Author: Andrew Jarombek
Date: 5/21/2022
"""

def to_hex(num: int) -> str:
    if num == 0:
        return '0'

    if num < 0:
        num = 2 ** 32 + num

    hex = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f']
    result = ""

    while num > 0:
        result = hex[(num % 16)] + result
        num //= 16

    return result
