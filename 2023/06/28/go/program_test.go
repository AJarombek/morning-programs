/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/28/2023
 */

package _go

import (
	"testing"
)

func TestHammingDistance(t *testing.T) {
	// Test case 1: x = 1, y = 4 should return 2
	x, y := 1, 4
	expected := 2
	result := hammingDistance(x, y)
	if result != expected {
		t.Errorf("Test case 1 failed: Expected %v, but got %v", expected, result)
	}

	// Test case 2: x = 7, y = 10 should return 3
	x, y = 7, 10
	expected = 3
	result = hammingDistance(x, y)
	if result != expected {
		t.Errorf("Test case 2 failed: Expected %v, but got %v", expected, result)
	}
}
