"""
https://leetcode.com/problems/unique-paths-ii/
Author: Andrew Jarombek
Date: 11/30/2022
"""

from typing import List


def unique_paths_with_obstacles(obstacle_grid: List[List[int]]) -> int:
    if obstacle_grid[0][0] == 1 or obstacle_grid[-1][-1] == 1:
        return 0

    m = len(obstacle_grid)
    n = len(obstacle_grid[0])
    locations = {(0, 0): 1}
    result = 0

    while locations:
        new_locations = {}

        for (x, y), value in locations.items():
            if x == n - 1 and y == m - 1:
                result += value
                continue

            if x + 1 < n and obstacle_grid[y][x + 1] == 0:
                location = (x + 1, y)
                current_value = new_locations.get(location, 0)
                new_locations[location] = current_value + value

            if y + 1 < m and obstacle_grid[y + 1][x] == 0:
                location = (x, y + 1)
                current_value = new_locations.get(location, 0)
                new_locations[location] = current_value + value

        locations = new_locations

    return result


if __name__ == '__main__':
    assert unique_paths_with_obstacles([[0, 0, 0], [0, 1, 0], [0, 0, 0]]) == 2
    assert unique_paths_with_obstacles([[0, 1], [0, 0]]) == 1
    assert unique_paths_with_obstacles([[1]]) == 0
