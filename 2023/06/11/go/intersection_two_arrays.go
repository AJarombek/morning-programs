/**
 * https://leetcode.com/problems/valid-perfect-square/
 * Author: Andrew Jarombek
 * Date: 6/11/2023
 */

package _go

func isPerfectSquare(num int) bool {
	high := num
	low := 1

	for high >= low {
		mid := (high + low) / 2
		val := mid * mid

		if val == num {
			return true
		} else if val > num {
			high = mid - 1
		} else {
			low = mid + 1
		}
	}

	return false
}
