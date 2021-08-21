"""
Problem: https://leetcode.com/problems/word-pattern/
Author: Andrew Jarombek
Date: 8/21/2021
"""


def word_pattern(pattern: str, s: str) -> bool:
    words = s.split(" ")

    if len(pattern) != len(words):
        return False

    pattern_to_word_map = {}
    word_to_pattern_map = {}

    for index, word in enumerate(words):
        if pattern[index] in pattern_to_word_map:
            if pattern_to_word_map.get(pattern[index]) != word:
                return False
        else:
            if word in word_to_pattern_map:
                return False
            else:
                pattern_to_word_map[pattern[index]] = word
                word_to_pattern_map[word] = pattern[index]

    return True


if __name__ == '__main__':
    assert word_pattern("abba", "dog cat cat dog")
