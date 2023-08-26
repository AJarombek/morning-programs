/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/26/2023
 */

package _go

import (
	"testing"
)

func TestMinDiffInBST(t *testing.T) {
	// Create a sample tree
	root := &TreeNode{
		Val: 4,
		Left: &TreeNode{
			Val:   2,
			Left:  &TreeNode{Val: 1},
			Right: &TreeNode{Val: 3},
		},
		Right: &TreeNode{Val: 6},
	}

	expected := 1
	result := minDiffInBST(root)

	if result != expected {
		t.Errorf("Expected: %d, Got: %d", expected, result)
	}

	// Test with an empty tree
	root = &TreeNode{
		Val:   4,
		Left:  nil,
		Right: &TreeNode{Val: 6},
	}

	expected = 2
	result = minDiffInBST(root)

	if result != expected {
		t.Errorf("Expected: %d, Got: %d", expected, result)
	}
}
