"""
https://leetcode.com/problems/path-crossing/
Author: Andrew Jarombek
Date: 8/15/2022
"""


def is_path_crossing(path: str) -> bool:
    location = (0, 0)
    prior_locations = {location}

    for direction in path:
        if direction == 'N':
            location = (location[0], location[1] + 1)
        elif direction == 'S':
            location = (location[0], location[1] - 1)
        elif direction == 'E':
            location = (location[0] + 1, location[1])
        elif direction == 'W':
            location = (location[0] - 1, location[1])

        if location in prior_locations:
            return True

        prior_locations.add(location)

    return False


if __name__ == '__main__':
    assert not is_path_crossing("NES")
    assert is_path_crossing("NESWW")
