/**
 * https://leetcode.com/problems/add-binary/
 * Author: Andrew Jarombek
 * Date: 5/4/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func climbStairs(n int) int {
	if n <= 3 {
		return n
	}

	prev := 2
	current := 3

	for i := 4; i <= n; i++ {
		next := prev + current
		prev = current
		current = next
	}

	return current
}

func TestClimbStairs(t *testing.T) {
	result := climbStairs(4)
	assert.Equal(t, 5, result)
}