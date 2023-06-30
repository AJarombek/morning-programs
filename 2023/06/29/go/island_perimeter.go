/**
 * https://leetcode.com/problems/island-perimeter/
 * Author: Andrew Jarombek
 * Date: 6/29/2023
 */

package _go

func islandPerimeter(grid [][]int) int {
	result := 0

	for i, row := range grid {
		for j, value := range row {
			if value == 1 {
				if i == 0 || grid[i-1][j] == 0 {
					result++
				}

				if j == 0 || grid[i][j-1] == 0 {
					result++
				}

				if i == len(grid)-1 || grid[i+1][j] == 0 {
					result++
				}

				if j == len(row)-1 || grid[i][j+1] == 0 {
					result++
				}
			}
		}
	}

	return result
}
