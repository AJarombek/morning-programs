/**
 * https://leetcode.com/problems/array-partition/
 * Author: Andrew Jarombek
 * Date: 7/16/2023
 */

package _go

import "sort"

func arrayPairSum(nums []int) int {
	sort.Slice(nums, func(i, j int) bool {
		return nums[i] > nums[j]
	})

	result := 0

	for i := 1; i < len(nums); i += 2 {
		result += nums[i]
	}

	return result
}
