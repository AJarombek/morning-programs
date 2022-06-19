/**
 * https://leetcode.com/problems/single-number/
 * Author: Andrew Jarombek
 * Date: 6/19/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func singleNumber(nums []int) int {
	result := 0

	for _, num := range nums {
		result ^= num
	}

	return result
}

func TestSingleNumber(t *testing.T) {
	assert.Equal(t, 1, singleNumber([]int {1}))
}