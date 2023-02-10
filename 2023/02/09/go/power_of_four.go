/**
 * https://leetcode.com/problems/power-of-four/
 * Author: Andrew Jarombek
 * Date: 2/9/2023
 */

package _go

func isPowerOfFour(n int) bool {
	if n <= 0 {
		return false
	}

	for n > 1 {
		if n%4 != 0 {
			return false
		}

		n /= 4
	}

	return true
}
