/**
 * The Go Programming Language - Chapter 2
 * Author: Andrew Jarombek
 * Date: 5/14/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func x2(val *int) *int {
	result := *val * 2
	return &result
}

func fib(val int) int {
	i, j := 0, 1

	for index := 0; index < val; index++ {
		i, j = j, j + i
	}

	return i
}

func TestCode(t *testing.T) {
	// Pointers
	age := 27
	p := &age
	*p++
	assert.Equal(t, 28, age)

	// Return Pointer from Function
	result := x2(p)
	assert.Equal(t, 28, age)
	assert.Equal(t, 56, *result)

	// Increment Pointer Value
	i := 1
	pi := &i
	*pi++
	assert.Equal(t, 2, i)
	assert.Equal(t, 2, *pi)

	// Using the built-in new() function to create a pointer
	j := new(int)
	assert.Equal(t, 0, *j)
	*j = 3
	assert.Equal(t, 3, *j)

	// Pointers are only equal if they point to the same address
	assert.False(t, new(int) == new(int))

	// Tuple assignment to easily swap values
	assert.Equal(t, 0, fib(0))
	assert.Equal(t, 1, fib(2))
	assert.Equal(t, 8, fib(6))
}