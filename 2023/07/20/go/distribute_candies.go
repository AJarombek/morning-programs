/**
 * https://leetcode.com/problems/subtree-of-another-tree/
 * Author: Andrew Jarombek
 * Date: 7/20/2023
 */

package _go

import "math"

func distributeCandies(candyType []int) int {
	candyMap := make(map[int]struct{})

	for _, candy := range candyType {
		candyMap[candy] = struct{}{}
	}

	return int(math.Min(float64(len(candyMap)), float64(len(candyType)/2)))
}
