/**
 * https://leetcode.com/problems/power-of-two/
 * Author: Andrew Jarombek
 * Date: 11/9/2022
 */

package _go

func isPowerOfTwo(n int) bool {
	if n < 1 {
		return false
	}

	for n > 1 {
		if n%2 != 0 {
			return false
		}

		n = n / 2
	}

	return true
}
