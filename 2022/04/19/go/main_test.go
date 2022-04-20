/**
 * https://leetcode.com/problems/search-insert-position/
 * Author: Andrew Jarombek
 * Date: 3/19/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func searchInsert(nums []int, target int) int {
	start := 0
	end := len(nums) - 1

	for start < end {
		mid := (start + end) / 2
		print(start, " ", end, " middle:", mid, "\n")

		if nums[mid] == target {
			return mid
		} else if nums[mid] > target {
			end = mid - 1
		} else {
			start = mid + 1
		}
	}

	print(start, " ", end, "\n")
	if nums[start] >= target {
		return start
	} else {
		return start + 1
	}
}

func TestSearchInsert(t *testing.T) {
	list := []int {1, 3, 5, 6}
	result := searchInsert(list, 2)
	assert.Equal(t, result, 1)
}