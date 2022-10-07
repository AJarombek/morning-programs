"""
https://leetcode.com/problems/group-anagrams/
Author: Andrew Jarombek
Date: 10/7/2022
"""

from typing import List


def group_anagrams(strs: List[str]) -> List[List[str]]:
    groups = {}

    for word in strs:
        key = ''.join(sorted(list(word)))
        words = groups.get(key, [])
        words.append(word)

        groups[key] = words

    return [value for value in groups.values()]


if __name__ == '__main__':
    assert group_anagrams(["eat", "tea", "tan", "ate", "nat", "bat"]) == (
        [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
    )
