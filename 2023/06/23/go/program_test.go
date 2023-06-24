/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/23/2023
 */

package _go

import "testing"

func TestAddStrings(t *testing.T) {
	// Test case 1: num1 = "123", num2 = "456"
	num1 := "123"
	num2 := "456"
	expected := "579"
	result := addStrings(num1, num2)
	if result != expected {
		t.Errorf("Test case 1 failed: Expected %s, but got %s", expected, result)
	}

	// Test case 2: num1 = "999", num2 = "1"
	num1 = "999"
	num2 = "1"
	expected = "1000"
	result = addStrings(num1, num2)
	if result != expected {
		t.Errorf("Test case 2 failed: Expected %s, but got %s", expected, result)
	}
}
