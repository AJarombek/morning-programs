/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Author: Andrew Jarombek
 * Date: 3/19/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func removeDuplicates(nums []int) int {
	slow := 1
	fast := 1

	for fast < len(nums) {
		if nums[fast] != nums[fast - 1] {
			nums[slow] = nums[fast]
			slow += 1
		}

		fast += 1
	}

	return slow
}

func TestRemoveDuplicates(t *testing.T) {
	list := []int {1, 1, 2}
	result := removeDuplicates(list)
	assert.Equal(t, result, 2)
	assert.Equal(t, list[0], 1)
	assert.Equal(t, list[1], 2)
}