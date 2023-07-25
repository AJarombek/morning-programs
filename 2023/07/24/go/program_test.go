/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/24/2023
 */

package _go

import (
	"testing"
)

func TestCanPlaceFlowers(t *testing.T) {
	// Test case 1: flowerbed = [1, 0, 0, 0, 1], n = 1
	flowerbed1 := []int{1, 0, 0, 0, 1}
	n1 := 1
	expected1 := true
	result1 := canPlaceFlowers(flowerbed1, n1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: Expected %v, but got %v", expected1, result1)
	}

	// Test case 2: flowerbed = [1, 0, 0, 0, 1], n = 2
	flowerbed2 := []int{1, 0, 0, 0, 1}
	n2 := 2
	expected2 := false
	result2 := canPlaceFlowers(flowerbed2, n2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: Expected %v, but got %v", expected2, result2)
	}
}
