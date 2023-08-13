/**
 * https://leetcode.com/problems/find-pivot-index/
 * Author: Andrew Jarombek
 * Date: 8/12/2023
 */

package _go

func pivotIndex(nums []int) int {
	right := 0

	for _, num := range nums {
		right += num
	}

	left := 0

	for i, num := range nums {
		right -= num

		if left == right {
			return i
		}

		left += num
	}

	return -1
}
