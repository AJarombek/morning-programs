/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/11/2023
 */

package _go

import (
	"testing"
)

func TestGetMinimumDifference(t *testing.T) {
	// Test case 1
	root1 := &TreeNode{
		Val:   4,
		Left:  &TreeNode{Val: 2},
		Right: &TreeNode{Val: 6},
	}
	expected1 := 2
	result1 := getMinimumDifference(root1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: expected %d, got %d", expected1, result1)
	}

	// Test case 2
	root2 := &TreeNode{
		Val: 4,
		Left: &TreeNode{
			Val:   2,
			Left:  &TreeNode{Val: 1},
			Right: &TreeNode{Val: 3},
		},
		Right: &TreeNode{Val: 6},
	}
	expected2 := 1
	result2 := getMinimumDifference(root2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: expected %d, got %d", expected2, result2)
	}
}
