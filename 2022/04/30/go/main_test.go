/**
 * https://leetcode.com/problems/maximum-subarray/
 * Author: Andrew Jarombek
 * Date: 4/30/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"math"
	"testing"
)

func maxSubArray(nums []int) int {
	result := nums[0]
	current := int(math.Max(0, float64(nums[0])))

	for i := 1; i < len(nums); i++ {
		val := current + nums[i]
		result = int(math.Max(float64(result), float64(val)))
		current = int(math.Max(0, float64(val)))
	}

	return result
}

func TestMaxSubarray(t *testing.T) {
	list := []int {-2, 1, -3, 4, -1, 2, 1, -5, 4}
	result := maxSubArray(list)
	assert.Equal(t, 6, result)
}