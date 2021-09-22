/**
 * Main functions to set up the Kubernetes test suite.
 * Author: Andrew Jarombek
 * Date: 9/22/2021
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func twoSum(nums []int, target int) []int {
	var result [2]int

	for i := 0; i < len(nums); i++ {
		for j := i+1; j < len(nums); j++ {
			sum := nums[i] + nums[j]
			if sum == target {
				result[0] = i
				result[1] = j
				return result[0:2]
			}
		}
	}

	return result[0:2]
}

func twoSumFast(nums []int, target int) []int {
	var result [2]int
	var m = make(map[int]int)

	for i := 0; i < len(nums); i++ {
		if val, ok := m[nums[i]]; ok {
			result[0] = val
			result[1] = i
			return result[0:2]
		} else {
			m[target - nums[i]] = i
		}
	}


	return result[0:2]
}

func TestTwoSum(t *testing.T) {
	nums := make([]int, 4)
	nums[0] = 2
	nums[1] = 7
	nums[2] = 11
	nums[3] = 15

	result1 := twoSum(nums, 9)
	result2 := twoSumFast(nums, 9)

	assert.Equal(t, result1[0], 0)
	assert.Equal(t, result1[1], 1)
	assert.Equal(t, result2[0], 0)
	assert.Equal(t, result2[1], 1)
}