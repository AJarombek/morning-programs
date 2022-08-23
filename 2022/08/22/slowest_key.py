"""
https://leetcode.com/problems/slowest-key/
Author: Andrew Jarombek
Date: 8/22/2022
"""

from typing import List


def slowest_key(release_times: List[int], keys_pressed: str) -> str:
    time = 0
    longest = 0
    longest_key = ''

    for i in range(len(release_times)):
        current_time = release_times[i]
        key = keys_pressed[i]
        duration = current_time - time

        if duration >= longest:
            longest_key = max(longest_key, key) if duration == longest else key
            longest = duration

        time = current_time

    return longest_key


if __name__ == '__main__':
    assert slowest_key([9, 29, 49, 50], "cbcd")
