"""
https://leetcode.com/problems/unique-paths/
Author: Andrew Jarombek
Date: 11/29/2022
"""


def unique_paths(m: int, n: int) -> int:
    locations = {(0, 0): 1}
    result = 0

    while locations:
        new_locations = {}

        for (x, y), value in locations.items():
            if x == n - 1 and y == m - 1:
                result += value
                continue

            if x + 1 < n:
                location = (x + 1, y)
                current_value = new_locations.get(location, 0)
                new_locations[location] = current_value + value

            if y + 1 < m:
                location = (x, y + 1)
                current_value = new_locations.get(location, 0)
                new_locations[location] = current_value + value

        locations = new_locations

    return result


if __name__ == '__main__':
    assert unique_paths(3, 7) == 28
    assert unique_paths(3, 2) == 3
