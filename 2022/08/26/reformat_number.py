"""
https://leetcode.com/problems/count-of-matches-in-tournament/
Author: Andrew Jarombek
Date: 8/26/2022
"""


def reformat_number(number: str) -> str:
    numbers = []

    for c in number:
        if c >= '0' and c <= '9':
            numbers.append(c)

    grouped_numbers = []
    index = 0

    while len(numbers) - index > 4:
        grouped_numbers.append("".join(numbers[index:index + 3]))
        index += 3

    if len(numbers) - index < 4:
        grouped_numbers.append("".join(numbers[index:]))
    else:
        grouped_numbers.append("".join(numbers[index:index + 2]))
        grouped_numbers.append("".join(numbers[index + 2:index + 4]))

    return "-".join(grouped_numbers)


if __name__ == '__main__':
    assert reformat_number("123 4-567") == "123-45-67"
    assert reformat_number("123 4-5678") == "123-456-78"
