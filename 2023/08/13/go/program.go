/**
 * https://leetcode.com/problems/self-dividing-numbers/
 * Author: Andrew Jarombek
 * Date: 8/13/2023
 */

package _go

func selfDividingNumbers(left int, right int) []int {
	result := make([]int, 0)

	for i := left; i <= right; i++ {
		if isSelfDividing(i) {
			result = append(result, i)
		}
	}

	return result
}

func isSelfDividing(num int) bool {
	n := num

	for n > 0 {
		digit := n % 10
		if digit == 0 || num%digit != 0 {
			return false
		}
		n /= 10
	}

	return true
}
