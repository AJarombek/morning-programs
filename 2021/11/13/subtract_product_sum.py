"""
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
Author: Andrew Jarombek
Date: 11/13/2021
"""


def subtract_product_and_sum_simplified(n: int) -> int:
    product = 1
    count = 0

    while n > 0:
        product *= n % 10
        count += n % 10
        n //= 10

    return product - count


def subtract_product_and_sum(n: int) -> int:
    product = n % 10
    count = n % 10
    n //= 10

    while n > 0:
        product *= n % 10
        count += n % 10
        n //= 10

    return product - count
