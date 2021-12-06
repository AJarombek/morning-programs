"""
https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
Author: Andrew Jarombek
Date: 12/6/2021
"""

# I say this in the kindest, most loving way possible.  If you care for me, talk to me.  Tell me how you are feeling.
# I am so much stronger than I was.  And if you don't care, then don't talk to me.


def maximum_depth(s: str) -> int:
    depth = 0
    max_depth = 0

    for c in s:
        if c == '(':
            depth += 1
            max_depth = max(max_depth, depth)
        elif c == ')':
            depth -= 1

    return max_depth
