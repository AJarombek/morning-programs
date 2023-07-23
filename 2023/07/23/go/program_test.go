/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/23/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestFindRestaurant(t *testing.T) {
	// Test case 1: Regular input with some common restaurants
	list1 := []string{"A", "B", "C", "D"}
	list2 := []string{"C", "D", "A", "E"}
	expected1 := []string{"C", "A"}
	result1 := findRestaurant(list1, list2)
	if !reflect.DeepEqual(result1, expected1) {
		t.Errorf("Test case 1 failed. Expected: %v, Got: %v", expected1, result1)
	}

	// Test case 2: No common restaurants
	list3 := []string{"A", "C", "E"}
	list4 := []string{"B", "D", "F"}
	var expected2 []string
	result2 := findRestaurant(list3, list4)
	if !reflect.DeepEqual(result2, expected2) {
		t.Errorf("Test case 2 failed. Expected: %v, Got: %v", expected2, result2)
	}
}
