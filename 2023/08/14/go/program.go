/**
 * https://leetcode.com/problems/flood-fill/
 * Author: Andrew Jarombek
 * Date: 8/14/2023
 */

package _go

func floodFill(image [][]int, sr int, sc int, color int) [][]int {
	value := image[sr][sc]

	if value == color {
		return image
	}

	fill(image, sr, sc, color, value)
	return image
}

func fill(image [][]int, sr int, sc int, color int, value int) {
	image[sr][sc] = color

	if sr > 0 && image[sr-1][sc] == value {
		fill(image, sr-1, sc, color, value)
	}

	if sr < len(image)-1 && image[sr+1][sc] == value {
		fill(image, sr+1, sc, color, value)
	}

	if sc > 0 && image[sr][sc-1] == value {
		fill(image, sr, sc-1, color, value)
	}

	if sc < len(image[0])-1 && image[sr][sc+1] == value {
		fill(image, sr, sc+1, color, value)
	}
}
