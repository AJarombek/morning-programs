/**
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/
 * Author: Andrew Jarombek
 * Date: 8/5/2023
 */

package _go

import "math"

func findLengthOfLCIS(nums []int) int {
	result := 1.0
	current := 1.0
	value := nums[0]

	for _, num := range nums[1:] {
		if num > value {
			current++
			result = math.Max(current, result)
		} else {
			current = 1
		}

		value = num
	}

	return int(result)
}
