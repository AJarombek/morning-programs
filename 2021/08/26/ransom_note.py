"""
Problem: https://leetcode.com/problems/ransom-note/
Author: Andrew Jarombek
Date: 8/26/2021
"""

# I'm guessing you are good :)


def can_construct(ransom_note: str, magazine: str) -> bool:
    ransom_note_dict = {}
    magazine_dict = {}

    for c in ransom_note:
        count = ransom_note_dict[c] + 1 if c in ransom_note_dict else 1
        ransom_note_dict[c] = count

    for c in magazine:
        count = magazine_dict[c] + 1 if c in magazine_dict else 1
        magazine_dict[c] = count

    for key, val in ransom_note_dict.items():
        if key in magazine_dict:
            if val > magazine_dict[key]:
                return False
        else:
            return False

    return True


if __name__ == '__main__':
    assert can_construct('aa', 'aab')
    assert not can_construct('aa', 'ab')
