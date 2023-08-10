/**
 * https://leetcode.com/problems/count-binary-substrings/
 * Author: Andrew Jarombek
 * Date: 8/9/2023
 */

package _go

import "math"

func countBinarySubstrings(s string) int {
	var x, y, result int
	var current rune

	for _, c := range s {
		if c == current {
			y++
		} else {
			result += int(math.Min(float64(x), float64(y)))
			x = y
			y = 1
			current = c
		}
	}

	return result + int(math.Min(float64(x), float64(y)))
}
