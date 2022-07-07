/**
 * https://leetcode.com/problems/reverse-bits/
 * Author: Andrew Jarombek
 * Date: 7/6/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func reverseBits(num uint32) uint32 {
	var result uint32
	i := 0

	for i < 32 {
		result = result << 1
		result += num & 1
		num = num >> 1
		i++
	}

	return result
}

func Test(t *testing.T) {
	assert.Equal(t, uint32(964176192), reverseBits(43261596))
}
