/**
 * https://leetcode.com/problems/valid-palindrome/
 * Author: Andrew Jarombek
 * Date: 6/17/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
	"unicode"
)

func isPalindrome(s string) bool {
	start := 0
	chars := []rune(s)
	end := len(chars) - 1

	for start < end {
		c1 := chars[start]

		for start < end && !unicode.IsLetter(c1) && !unicode.IsDigit(c1) {
			start++
			c1 = chars[start]
		}

		if start == end {
			return true
		}

		c2 := chars[end]

		for !unicode.IsLetter(c2) && !unicode.IsDigit(c2) {
			end--
			c2 = chars[end]
		}

		if unicode.ToLower(c1) != unicode.ToLower(c2) {
			return false
		}

		start++
		end--
	}

	return true
}

func TestIsPalindrome(t *testing.T) {
	assert.True(t, isPalindrome("race car"))
}