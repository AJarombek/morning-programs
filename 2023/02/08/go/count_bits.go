/**
 * https://leetcode.com/problems/counting-bits/
 * Author: Andrew Jarombek
 * Date: 2/8/2023
 */

package _go

func countBits(n int) []int {
	result := []int{0}

	for i := 1; i <= n; i++ {
		count := 0
		val := i

		for val > 0 {
			count += val & 1
			val >>= 1
		}

		result = append(result, count)
	}

	return result
}
