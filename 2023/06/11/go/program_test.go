/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/11/2023
 */

package _go

import "testing"

func TestIsPerfectSquare(t *testing.T) {
	// Test case 1: Perfect square number
	num1 := 16
	expected1 := true
	result1 := isPerfectSquare(num1)
	if result1 != expected1 {
		t.Errorf("isPerfectSquare(%d) = %t; expected %t", num1, result1, expected1)
	}

	// Test case 2: Non-perfect square number
	num2 := 14
	expected2 := false
	result2 := isPerfectSquare(num2)
	if result2 != expected2 {
		t.Errorf("isPerfectSquare(%d) = %t; expected %t", num2, result2, expected2)
	}
}
