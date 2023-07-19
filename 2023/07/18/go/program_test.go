/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/18/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestMatrixReshape(t *testing.T) {
	// Test case 1
	mat1 := [][]int{
		{1, 2},
		{3, 4},
	}
	r1 := 1
	c1 := 4
	expected1 := [][]int{
		{1, 2, 3, 4},
	}
	result1 := matrixReshape(mat1, r1, c1)
	if !reflect.DeepEqual(result1, expected1) {
		t.Errorf("Unexpected result. Expected: %v, Got: %v", expected1, result1)
	}

	// Test case 2
	mat2 := [][]int{
		{1, 2},
		{3, 4},
	}
	r2 := 2
	c2 := 2
	expected2 := [][]int{
		{1, 2},
		{3, 4},
	}
	result2 := matrixReshape(mat2, r2, c2)
	if !reflect.DeepEqual(result2, expected2) {
		t.Errorf("Unexpected result. Expected: %v, Got: %v", expected2, result2)
	}
}
