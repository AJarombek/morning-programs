"""
https://leetcode.com/problems/roman-to-integer/
Author: Andrew Jarombek
Date: 7/14/2021
"""

def roman_to_int(s: str):
    values = {
        'I': 1,
        'IV': 4,
        'V': 5,
        'IX': 9,
        'X': 10,
        'XL': 40,
        'L': 50,
        'XC': 90,
        'C': 100,
        'CD': 400,
        'D': 500,
        'CM': 900,
        'M': 1000
    }

    result = 0
    index = 0

    while index < len(s):
        if (x := values.get(s[index:index + 2])) is not None:
            result += x
            index += 2
        else:
            result += values.get(s[index])
            index += 1

    return result
