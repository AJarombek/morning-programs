/**
 * https://leetcode.com/problems/palindrome-number/
 * Author: Andrew Jarombek
 * Date: 10/13/2021
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func isPalindrome(x int) bool {
	if x < 0 {
		return false
	}

	if x < 10 {
		return true
	}

	y := x
	z := 0

	for y > 0 {
		z *= 10
		z += y % 10
		y /= 10
	}

	return x == z
}

func TestIsPalindrome(t *testing.T) {
	assert.True(t, isPalindrome(121))
	assert.False(t, isPalindrome(-121))
	assert.False(t, isPalindrome(10))
}