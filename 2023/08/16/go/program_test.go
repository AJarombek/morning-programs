/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/16/2023
 */

package _go

import (
	"testing"
)

func TestMinCostClimbingStairs(t *testing.T) {
	// Test case 1: Regular case with multiple steps
	cost1 := []int{10, 15, 20}
	expected1 := 15
	result1 := minCostClimbingStairs(cost1)
	if result1 != expected1 {
		t.Errorf("Expected %d, but got %d", expected1, result1)
	}

	// Test case 2: Edge case with only two steps
	cost2 := []int{1, 100}
	expected2 := 1
	result2 := minCostClimbingStairs(cost2)
	if result2 != expected2 {
		t.Errorf("Expected %d, but got %d", expected2, result2)
	}
}
