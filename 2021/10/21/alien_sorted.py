"""
https://leetcode.com/problems/verifying-an-alien-dictionary/
Author: Andrew Jarombek
Date: 10/21/2021
"""

from typing import List


def is_alien_sorted(words: List[str], order: str) -> bool:
    order_dict = {key: value for value, key in enumerate(order)}

    for index in range(1, len(words)):
        sort_index = 0
        min_length = min(len(words[index]), len(words[index - 1]))

        while sort_index < min_length and words[index][sort_index] == words[index - 1][sort_index]:
            sort_index += 1

        if sort_index == min_length:
            if len(words[index]) < len(words[index - 1]):
                return False
        else:
            current = order_dict.get(words[index][sort_index])
            previous = order_dict.get(words[index - 1][sort_index])

            if current < previous:
                return False

    return True
