"""
https://leetcode.com/problems/valid-parentheses/
Author: Andrew Jarombek
Date: 7/16/2021
"""

# In NYC with Tom & Joe for the night


def is_valid(s: str) -> bool:
    left = {'{', '(', '['}
    right = {'}', ')', ']'}
    combined = {'{}', '()', '[]'}

    parens = []

    for c in s:
        if c in left:
            parens.append(c)
        elif c in right:
            if len(parens) == 0:
                return False

            prev_c = parens.pop()

            if f'{prev_c}{c}' not in combined:
                return False
        else:
            return False

    return len(parens) == 0


if __name__ == '__main__':
    assert is_valid("()")
    assert is_valid("()[]{}")
    assert not is_valid("(]")
    assert not is_valid("([)]")
    assert is_valid("{[]}")
