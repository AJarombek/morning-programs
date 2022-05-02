/**
 * https://leetcode.com/problems/length-of-last-word/
 * Author: Andrew Jarombek
 * Date: 5/1/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func lengthOfLastWord(s string) int {
	index := len(s) - 1

	for index >= 0 && s[index] == ' ' {
		index--
	}

	result := 0
	for index >= 0 && s[index] != ' ' {
		result++
		index--
	}

	return result
}

func TestLengthOfLastWord(t *testing.T) {
	result := lengthOfLastWord("My name is andy ")
	assert.Equal(t, 4, result)
}