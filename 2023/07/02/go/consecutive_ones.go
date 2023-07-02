/**
 * https://leetcode.com/problems/max-consecutive-ones/
 * Author: Andrew Jarombek
 * Date: 7/2/2023
 */

package _go

func findMaxConsecutiveOnes(nums []int) int {
	result := 0
	current := 0

	for _, num := range nums {
		if num == 1 {
			current++

			if current > result {
				result = current
			}
		} else {
			current = 0
		}
	}

	return result
}
