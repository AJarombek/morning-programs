/**
 * https://leetcode.com/problems/valid-parentheses/
 * Author: Andrew Jarombek
 * Date: 1/23/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func isValid(s string) bool {
	stack := make([]rune, 0)

	for _, c := range s {
		if c == '(' {
			stack = append(stack, ')')
		} else if c == '[' {
			stack = append(stack, ']')
		} else if c == '{' {
			stack = append(stack, '}')
		} else if len(stack) > 0 && c == stack[len(stack) - 1] {
			stack = stack[0:len(stack) - 1]
		} else {
			return false
		}
	}

	return len(stack) == 0
}

func TestValidParenthesis(t *testing.T) {
	assert.True(t, isValid("[]"))
	assert.False(t, isValid("[}"))
}