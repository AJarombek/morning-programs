"""
https://leetcode.com/problems/1-bit-and-2-bit-characters/
Author: Andrew Jarombek
Date: 9/25/2021
"""

from typing import List


def flood_fill(self, image: List[List[int]], sr: int, sc: int, newColor: int) -> List[List[int]]:
    self.imageVisited = [[0 for i in range(len(image[0]))] for i in range(len(image))]
    color = image[sr][sc]
    image[sr][sc] = newColor
    self.imageVisited[sr][sc] = -1
    return self.floodFillRecursive(image, sr, sc, newColor, color)


def flood_fill_recursive(self, image: List[List[int]], sr: int, sc: int, newColor: int, color: int) -> List[List[int]]:
    if sr - 1 >= 0 and self.imageVisited[sr - 1][sc] != -1 and image[sr - 1][sc] == color:
        image[sr - 1][sc] = newColor
        self.imageVisited[sr - 1][sc] = -1
        self.floodFillRecursive(image, sr - 1, sc, newColor, color)

    if sr + 1 < len(image) and self.imageVisited[sr + 1][sc] != -1 and image[sr + 1][sc] == color:
        image[sr + 1][sc] = newColor
        self.imageVisited[sr + 1][sc] = -1
        self.floodFillRecursive(image, sr + 1, sc, newColor, color)

    if sc - 1 >= 0 and self.imageVisited[sr][sc - 1] != -1 and image[sr][sc - 1] == color:
        image[sr][sc - 1] = newColor
        self.imageVisited[sr][sc - 1] = -1
        self.floodFillRecursive(image, sr, sc - 1, newColor, color)

    if sc + 1 < len(image[0]) and self.imageVisited[sr][sc + 1] != -1 and image[sr][sc + 1] == color:
        image[sr][sc + 1] = newColor
        self.imageVisited[sr][sc + 1] = -1
        self.floodFillRecursive(image, sr, sc + 1, newColor, color)

    return image
