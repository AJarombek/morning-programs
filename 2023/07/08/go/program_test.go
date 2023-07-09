/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/8/2023
 */

package _go

import "testing"

func TestConvertToBase7(t *testing.T) {
	// Test case 1: Positive number
	num1 := 100
	expected1 := "202"
	result1 := convertToBase7(num1)
	if result1 != expected1 {
		t.Errorf("Expected %s, but got %s for input %d", expected1, result1, num1)
	}

	// Test case 2: Negative number
	num2 := -7
	expected2 := "-10"
	result2 := convertToBase7(num2)
	if result2 != expected2 {
		t.Errorf("Expected %s, but got %s for input %d", expected2, result2, num2)
	}
}
