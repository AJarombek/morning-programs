/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/29/2023
 */

package _go

import (
	"testing"
)

func TestIslandPerimeter(t *testing.T) {
	// Test case 1: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]] should return 16
	grid := [][]int{
		{0, 1, 0, 0},
		{1, 1, 1, 0},
		{0, 1, 0, 0},
		{1, 1, 0, 0},
	}
	expected := 16
	result := islandPerimeter(grid)
	if result != expected {
		t.Errorf("Test case 1 failed: Expected %v, but got %v", expected, result)
	}

	// Test case 2: grid = [[1]] should return 4
	grid = [][]int{
		{1},
	}
	expected = 4
	result = islandPerimeter(grid)
	if result != expected {
		t.Errorf("Test case 2 failed: Expected %v, but got %v", expected, result)
	}
}
