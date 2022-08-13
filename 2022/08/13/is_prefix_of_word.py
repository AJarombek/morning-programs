"""
https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
Author: Andrew Jarombek
Date: 8/13/2022
"""


def is_prefix_of_word(sentence: str, search_word: str) -> int:
    for index, word in enumerate(sentence.split()):
        if len(word) >= len(search_word) and word[:len(search_word)] == search_word:
            return index + 1

    return -1


if __name__ == '__main__':
    assert is_prefix_of_word("my name is andy", "and") == 4
    assert is_prefix_of_word("my name is andy", "jar") == -1
