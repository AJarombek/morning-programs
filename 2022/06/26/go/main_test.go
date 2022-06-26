/**
 * The Go Programming Language: Section 4.4
 * Author: Andrew Jarombek
 * Date: 6/26/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
	"./other"
)

type exercise struct {
	Date string
	Type string
	Miles float64
}

type MilitaryTime struct {
	Hours, Minutes, Seconds int
}

type Point struct {
	x, y int
}

func Test(t *testing.T) {
	// If not explicitly assigned, the values of each field in a struct
	// are assigned their type's default value.
	defaultExercise := exercise{}
	assert.Equal(t, "", defaultExercise.Date)
	assert.Equal(t, "", defaultExercise.Type)
	assert.Equal(t, 0.0, defaultExercise.Miles)
	
	// Fields can be combined on a single line in a struct definition.
	// Structs can be initialized shorthand (order dependent) or with labels (unordered)
	time := MilitaryTime{20, 0, 10}
	otherTime := MilitaryTime{Hours: 20, Seconds: 10}

	// Assert that the two structs above are equal.  The == operator can be used on structs
	// if all the field types in the struct are comparable.
	assert.True(t, time == otherTime)

	// Lowercase fields in a struct are not exported.  In the following code, x and y
	// are still accessible because the struct Point is defined in the same package as this main() method.
	point := Point{x: 1, y: 2}
	assert.Equal(t, 2, point.y)

	// This code fails because x and y are not accessible outside the 'other' package
	// otherPoint := other.Point{x: 1, y: 1}

	// This code compiles, but x and y are still not accessible.
	otherPoint := other.Point{}

	// This code will not compile
	// x := otherPoint.x

	assert.NotNil(t, otherPoint)
}