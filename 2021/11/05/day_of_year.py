"""
https://leetcode.com/problems/day-of-the-year/
Author: Andrew Jarombek
Date: 11/5/2021
"""


def day_of_year(date: str) -> int:
    days = int(date[-2:])
    month = int(date[5:7])
    year = int(date[:4])

    long = {1, 3, 5, 7, 8, 10, 12}
    short = {4, 6, 9, 11}

    while month > 1:
        if month - 1 in long:
            days += 31
        elif month - 1 in short:
            days += 30
        elif year % 4 == 0:
            days += 29
        else:
            days += 28

        month -= 1

    return days
