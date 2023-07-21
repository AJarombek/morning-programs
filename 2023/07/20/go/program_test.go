/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/20/2023
 */

package _go

import (
	"testing"
)

func TestDistributeCandies(t *testing.T) {
	// Test case 1: All unique candies
	input1 := []int{1, 2, 3, 4, 5, 6}
	expected1 := 3
	result1 := distributeCandies(input1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed. Expected: %d, Got: %d", expected1, result1)
	}

	// Test case 2: Some duplicate candies
	input2 := []int{1, 2, 3, 1, 2, 3, 4, 4}
	expected2 := 4
	result2 := distributeCandies(input2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed. Expected: %d, Got: %d", expected2, result2)
	}
}
