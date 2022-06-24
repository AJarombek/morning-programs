/**
 * The Go Programming Language: Section 4.2 (continued)
 * Author: Andrew Jarombek
 * Date: 6/24/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

type Stack []int

func (s *Stack) push(val int) {
	*s = append(*s, val)
}

func (s *Stack) top() int {
	return (*s)[len(*s) - 1]
}

func (s *Stack) isEmpty() bool {
	return len(*s) == 0
}

func (s *Stack) pop() (int, bool) {
	if s.isEmpty() {
		return 0, false
	} else {
		element := (*s)[len(*s) - 1]
		*s = (*s)[:len(*s) - 1]
		return element, true
	}
}

func Test(t *testing.T) {
	// Append a slice to a slice using the ellipsis notation
	slice := []int{1, 2}
	slice = append(slice, slice...)

	assert.Equal(t, 4, len(slice))
	
	// Slice techniques can be used to create data structures, such as a stack
	var stack Stack
	assert.True(t, stack.isEmpty())

	stack.push(0)
	assert.False(t, stack.isEmpty())

	stack.push(1)
	assert.Equal(t, 1, stack.top())

	value, success := stack.pop()
	assert.Equal(t, 1, value)
	assert.True(t, success)

	value, success = stack.pop()
	assert.Equal(t, 0, value)
	assert.True(t, success)

	value, success = stack.pop()
	assert.False(t, success)
}