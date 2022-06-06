"""
https://leetcode.com/problems/remove-outermost-parentheses/
Author: Andrew Jarombek
Date: 6/6/2022
"""

# I'm having a rough day.  I wish I could properly express how much I care for you and
# tell you that I think you are a beautiful person.  Here is a picture of Dotty and I from
# this afternoon.  We miss you.


def remove_outer_parentheses(s: str) -> str:
    result = []
    depth = 0

    for c in s:
        if c == "(":
            if depth > 0:
                result.append(c)

            depth += 1
        else:
            if depth > 1:
                result.append(c)

            depth -= 1

    return "".join(result)
