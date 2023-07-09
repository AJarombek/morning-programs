/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/9/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestFindRelativeRanks(t *testing.T) {
	// Test case 1
	scores := []int{8, 10, 5, 4, 2}
	expected := []string{"Silver Medal", "Gold Medal", "Bronze Medal", "4", "5"}
	result := findRelativeRanks(scores)

	if !reflect.DeepEqual(result, expected) {
		t.Errorf("Test case 1 failed: expected %v, got %v", expected, result)
	}

	// Test case 2
	scores = []int{1, 2, 3, 4, 5}
	expected = []string{"5", "4", "Bronze Medal", "Silver Medal", "Gold Medal"}
	result = findRelativeRanks(scores)

	if !reflect.DeepEqual(result, expected) {
		t.Errorf("Test case 2 failed: expected %v, got %v", expected, result)
	}
}
