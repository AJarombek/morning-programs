/**
 * https://leetcode.com/problems/binary-search/
 * Author: Andrew Jarombek
 * Date: 8/25/2023
 */

package _go

func search(nums []int, target int) int {
	start := 0
	end := len(nums) - 1

	for start <= end {
		mid := (start + end) / 2
		val := nums[mid]

		if val == target {
			return mid
		}

		if val > target {
			end = mid - 1
		} else {
			start = mid + 1
		}
	}

	return -1
}
