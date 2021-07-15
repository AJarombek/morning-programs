"""
https://leetcode.com/problems/longest-common-prefix/
Author: Andrew Jarombek
Date: 7/15/2021
"""

# Stay strong, you are so loved.  Keep my love close to you & let it help you through whatever challenges you face.
# Racing a 2 mile on the track this evening in CT with Joe.

from typing import List


def longest_common_prefix(strs: List[str]) -> str:
    prefix = strs[0]

    for i in range(1, len(strs)):
        current_str = strs[i]
        for j in range(len(prefix)):
            if current_str[:j + 1] != prefix[:j + 1]:
                prefix = current_str[:j]
                break

    return prefix


if __name__ == '__main__':
    input1 = ["flower", "flow", "flight"]
    assert longest_common_prefix(input1) == "fl"

    input2 = ["dog", "racecar", "car"]
    assert longest_common_prefix(input2) == ""
