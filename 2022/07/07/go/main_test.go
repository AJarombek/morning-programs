/**
 * https://leetcode.com/problems/number-of-1-bits/
 * Author: Andrew Jarombek
 * Date: 7/7/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func hammingWeight(num uint32) int {
	result := 0

	for num > 0 {
		result += int(num & 1)
		num = num >> 1
	}

	return result
}

func Test(t *testing.T) {
	assert.Equal(t, 0, hammingWeight(0))
	assert.Equal(t, 1, hammingWeight(1))
	assert.Equal(t, 1, hammingWeight(2))
	assert.Equal(t, 2, hammingWeight(3))
	assert.Equal(t, 1, hammingWeight(4))
	assert.Equal(t, 2, hammingWeight(5))
	assert.Equal(t, 2, hammingWeight(6))
	assert.Equal(t, 3, hammingWeight(7))
	assert.Equal(t, 1, hammingWeight(8))
}
