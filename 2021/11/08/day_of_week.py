"""
https://leetcode.com/problems/day-of-the-week/
Author: Andrew Jarombek
Date: 11/8/2021
"""

import datetime


def day_of_the_week(day: int, month: int, year: int) -> str:
    days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    weekday = datetime.datetime(year, month, day).weekday()
    return days[weekday]
