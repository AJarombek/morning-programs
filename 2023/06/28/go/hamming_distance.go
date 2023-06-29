/**
 * https://leetcode.com/problems/hamming-distance/
 * Author: Andrew Jarombek
 * Date: 6/28/2023
 */

package _go

func hammingDistance(x int, y int) int {
	result := 0

	for x > 0 || y > 0 {
		if x%2 != y%2 {
			result++
		}

		x >>= 1
		y >>= 1
	}

	return result
}
