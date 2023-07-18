/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/17/2023
 */

package _go

import (
	"testing"
)

func TestFindTilt(t *testing.T) {
	// Test Case 1: Tree with single node
	root := &TreeNode{Val: 5}
	expected := 0
	result := findTilt(root)
	if result != expected {
		t.Errorf("Unexpected result. Expected: %d, Got: %d", expected, result)
	}

	// Test Case 2: Tree with multiple nodes
	root = &TreeNode{
		Val: 1,
		Left: &TreeNode{
			Val:   2,
			Left:  &TreeNode{Val: 4},
			Right: &TreeNode{Val: 5},
		},
		Right: &TreeNode{
			Val:  3,
			Left: &TreeNode{Val: 6},
		},
	}
	expected = 9
	result = findTilt(root)
	if result != expected {
		t.Errorf("Unexpected result. Expected: %d, Got: %d", expected, result)
	}
}
