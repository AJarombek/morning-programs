"""
https://leetcode.com/problems/binary-number-with-alternating-bits/
Author: Andrew Jarombek
Date: 9/23/2021
"""

# I hope you are doing well and life is treating you kindly.  I'm sorry, Andy worries sometimes


def has_alternating_bits(n: int) -> bool:
    prev = n % 2
    n //= 2

    while n > 0:
        current = n % 2

        if current == prev:
            return False
        else:
            prev = current
            n //= 2

    return True


if __name__ == '__main__':
    assert has_alternating_bits(5)
    assert not has_alternating_bits(7)
    assert not has_alternating_bits(11)
