"""
https://leetcode.com/problems/number-of-days-between-two-dates/
Author: Andrew Jarombek
Date: 11/6/2021
"""


import datetime


def days_between_dates(date1: str, date2: str) -> int:
    if date1 > date2:
        start = date2
        end = date1
    else:
        start = date1
        end = date2

    diff = datetime.datetime.strptime(end, '%Y-%m-%d') - datetime.datetime.strptime(start, '%Y-%m-%d')
    return diff.days
