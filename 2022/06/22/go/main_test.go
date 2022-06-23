/**
 * The Go Programming Language: Section 4.1
 * Author: Andrew Jarombek
 * Date: 6/22/2022
 */

package _go

import (
	"fmt"
	"github.com/stretchr/testify/assert"
	"testing"
)

func increment(arr [2]int) {
	for i, v := range arr {
		arr[i] = v + 1
	}

	fmt.Println(arr)
}

func incrementRef(arr *[2]int) {
	for i, v := range arr {
		arr[i] = v + 1
	}

	fmt.Println(*arr)
}

func Test(t *testing.T) {
	// Different ways to initialize arrays in Go
	var a1 [2]int = [2]int{1, 2}
	a2 := [2]int{3, 4}

	// When ellipses are used (...), the length of the array is determined by the number of
	// values in the initializer (in this case, two).
	a3 := [...]int{1, 2}

	// For arrays in Go, the length and capacity are the same.  This is not necessarily true
	// (and more often than not is not true) for slices.
	assert.Equal(t, 2, cap(a1))
	assert.Equal(t, 2, cap(a2))
	assert.Equal(t, 2, cap(a3))

	assert.Equal(t, len(a1), cap(a1))
	assert.Equal(t, len(a2), cap(a2))
	assert.Equal(t, len(a3), cap(a3))

	// Arrays are equal if their contents are equal
	assert.Equal(t, a1, a3)
	assert.True(t, a1 == a3)

	assert.NotEqual(t, a1, a2)
	assert.False(t, a1 == a2)

	// Go passes arrays to functions by value, which means it creates a copy of the array
	// and a shallow copy of its contents.  This is inefficient for large arrays.

	// Prints [2 3]
	increment(a1)

	// However, the contents of a1 are unchanged, due to the array being passed by value
	assert.Equal(t, 1, a1[0])
	assert.Equal(t, 2, a1[1])

	// If you pass an array as a pointer, it is passed by reference

	// Prints [2 3]
	incrementRef(&a1)

	// The contents of a1 are changed.
	assert.Equal(t, 2, a1[0])
	assert.Equal(t, 3, a1[1])
}