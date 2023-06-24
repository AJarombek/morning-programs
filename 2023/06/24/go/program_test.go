/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/24/2023
 */

package _go

import "testing"

func TestArrangeCoins(t *testing.T) {
	// Test case 1: n = 5
	n := 5
	expected := 2
	result := arrangeCoins(n)
	if result != expected {
		t.Errorf("Test case 1 failed: Expected %d, but got %d", expected, result)
	}

	// Test case 2: n = 8
	n = 8
	expected = 3
	result = arrangeCoins(n)
	if result != expected {
		t.Errorf("Test case 2 failed: Expected %d, but got %d", expected, result)
	}
}
