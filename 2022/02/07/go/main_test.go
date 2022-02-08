/**
 * https://leetcode.com/problems/remove-element/
 * Author: Andrew Jarombek
 * Date: 2/7/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func removeElement(nums []int, val int) int {
	index := 0
	end := len(nums) - 1

	for index <= end {
		if nums[index] == val {
			nums[index] = nums[end]
			end -= 1
		} else {
			index += 1
		}
	}

	return end + 1
}

func TestValidParenthesis(t *testing.T) {
	array := []int {3, 2, 2, 3}
	elements := removeElement(array, 2)
	assert.Equal(t, 2, elements)

	assert.Equal(t, 3, array[0])
	assert.Equal(t, 3, array[1])
}