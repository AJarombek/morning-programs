/**
 * https://leetcode.com/problems/baseball-game/
 * Author: Andrew Jarombek
 * Date: 8/8/2023
 */

package _go

func hasAlternatingBits(n int) bool {
	expected := n % 2

	for n > 0 {
		if n%2 != expected {
			return false
		}

		n >>= 1
		expected ^= 1
	}

	return true
}
