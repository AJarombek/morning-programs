/**
 * The Go Programming Language: Section 4.2
 * Author: Andrew Jarombek
 * Date: 6/23/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func Test(t *testing.T) {
	// Declare an array (longer initialization syntax)
	exercises := [...]string{0: "run", 1: "bike", 2: "kayak", 3: "walk", 4: "other"}
	assert.Equal(t, 5, len(exercises))
	assert.Equal(t, 5, cap(exercises))

	// Create corresponding constants for each array index
	const (
		RUN int = iota
		BIKE
		KAYAK
		WALK
		OTHER
	)

	assert.Equal(t, "kayak", exercises[KAYAK])

	// Create a slice from the array.
	xtrain := exercises[1:4]

	// In this case, the capacity of the slice is greater than the length.
	//This is because the underlying array for the slice extends one element beyond the slices end.
	assert.Equal(t, 3, len(xtrain))
	assert.Equal(t, 4, cap(xtrain))

	assert.Equal(t, "bike", xtrain[0])
	assert.Equal(t, "kayak", xtrain[1])
	assert.Equal(t, "walk", xtrain[2])

	// If its within the underlying arrays capacity, you can extend a slice beyond its length
	otherExercises := xtrain[:4]

	assert.Equal(t, "bike", otherExercises[0])
	assert.Equal(t, "kayak", otherExercises[1])
	assert.Equal(t, "walk", otherExercises[2])
	assert.Equal(t, "other", otherExercises[3])

	// Convert an entire array into a slice
	exercisesSlice := exercises[:]
	assert.Equal(t, 5, len(exercisesSlice))
	assert.Equal(t, 5, cap(exercisesSlice))

	// Slices can't be tested for equality like arrays.
	// For example, the following operation is illegal in Go.

	// // Invalid operation: otherExercises == exercisesSlice (operator == is not defined on []string)
	// assert.False(t, otherExercises == exercisesSlice)

	// Go has interesting properties for nil slices & empty slices.  Nil slices have np underlying array.
	// Empty slices have an underlying array with length 0.
	var slice []int

	// Slice is currently a nil slice
	assert.Nil(t, slice)
	assert.Equal(t, 0, len(slice))

	// Other ways to create a nil slice
	slice = nil
	slice = []int(nil)

	// Change slice into an empty slice
	slice = []int{}

	assert.NotNil(t, slice)
	assert.Equal(t, 0, len(slice))

	// Make a slice of a certain length and capacity with make()
	length := 2
	capacity := 4
	slice = make([]int, length, capacity)

	assert.Equal(t, 2, len(slice))
	assert.Equal(t, 4, cap(slice))
	assert.Equal(t, 0, slice[0])
	assert.Equal(t, 0, slice[1])

	// Appending to a slice will increase just the length as long as there is capacity
	slice = append(slice, 1, 2)

	assert.Equal(t, 4, len(slice))
	assert.Equal(t, 4, cap(slice))

	// When the length equals the capacity, appending an item increases
	//the length by one and capacity by an implementation specific amount.
	slice = append(slice, 3)

	assert.Equal(t, 5, len(slice))
	assert.Equal(t, 8, cap(slice)) // On my machine, the capacity doubled.
}