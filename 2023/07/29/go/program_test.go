/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/29/2023
 */

package _go

import (
	"testing"
)

func TestAverageOfLevels(t *testing.T) {
	// Test case 1: Root has one node with value 3
	root1 := &TreeNode{Val: 3}
	expected1 := []float64{3.0}
	result1 := averageOfLevels(root1)
	if !sliceEqual(result1, expected1) {
		t.Errorf("Test case 1 failed. Expected: %v, Got: %v", expected1, result1)
	}

	// Test case 2: Root has three nodes, forming a binary tree:
	//     4
	//    / \
	//   2   6
	root2 := &TreeNode{
		Val:   4,
		Left:  &TreeNode{Val: 2},
		Right: &TreeNode{Val: 6},
	}
	expected2 := []float64{4.0, 4.0}
	result2 := averageOfLevels(root2)
	if !sliceEqual(result2, expected2) {
		t.Errorf("Test case 2 failed. Expected: %v, Got: %v", expected2, result2)
	}
}

// Helper function to compare slices of floats
func sliceEqual(s1, s2 []float64) bool {
	if len(s1) != len(s2) {
		return false
	}
	for i := range s1 {
		if s1[i] != s2[i] {
			return false
		}
	}
	return true
}
