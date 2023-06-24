/**
 * https://leetcode.com/problems/add-strings/
 * Author: Andrew Jarombek
 * Date: 6/24/2023
 */

package _go

func arrangeCoins(n int) int {
	steps := 0

	for n > steps {
		steps++
		n -= steps
	}

	return steps
}
