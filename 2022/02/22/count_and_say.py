"""
https://leetcode.com/problems/count-and-say/
Author: Andrew Jarombek
Date: 2/22/2022
"""


def count_and_say(n: int) -> str:
    result = "1"

    for i in range(1, n):
        index = 0
        end = len(result)
        new_result = ""

        while index < end:
            value = result[index]
            count = 1

            if index + 1 < end and result[index + 1] == value:
                if index + 2 < end and result[index + 2] == value:
                    count = 3
                else:
                    count = 2

            new_result += f"{count}{value}"
            index += count

        result = new_result

    return result
