"""
https://leetcode.com/problems/find-smallest-letter-greater-than-target/
Author: Andrew Jarombek
Date: 9/26/2021
"""

# Back home.  Without wanting you to feel bad or anything, I just want you to know that I miss you a lot.
# My love is always here for you.


from typing import List


def next_greatest_letter(letters: List[str], target: str) -> str:
    for letter in letters:
        if letter > target:
            return letter

    return letters[0]


if __name__ == '__main__':
    assert next_greatest_letter(["a", "c", "f"], "b") == "c"
    assert next_greatest_letter(["a", "c", "f"], "f") == "a"
