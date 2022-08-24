"""
https://leetcode.com/problems/maximum-repeating-substring/
Author: Andrew Jarombek
Date: 8/23/2022
"""


def max_repeating(sequence: str, word: str) -> int:
    result = 0

    for index, c in enumerate(sequence):
        if c == word[0]:
            val = 0

            while sequence[index:index + len(word)] == word:
                index += len(word)
                val += 1

            result = max(result, val)

    return result


if __name__ == '__main__':
    assert max_repeating("ababc", "ab") == 2
    assert max_repeating("ababc", "ba") == 1
    assert max_repeating("ababc", "ac") == 0
