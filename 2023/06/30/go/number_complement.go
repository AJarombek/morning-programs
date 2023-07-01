/**
 * https://leetcode.com/problems/island-perimeter/
 * Author: Andrew Jarombek
 * Date: 6/30/2023
 */

package _go

func findComplement(num int) int {
	result := 0
	power := 1

	for num > 0 {
		if num%2 == 0 {
			result += power
		}

		power <<= 1
		num >>= 1
	}

	return result
}
