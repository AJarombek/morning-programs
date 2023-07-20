/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/19/2023
 */

package _go

import (
	"testing"
)

func TestIsSubtree(t *testing.T) {
	// Test case 1
	root1 := &TreeNode{
		Val: 3,
		Left: &TreeNode{
			Val:   4,
			Left:  &TreeNode{Val: 1},
			Right: &TreeNode{Val: 2},
		},
		Right: &TreeNode{Val: 5},
	}

	subRoot1 := &TreeNode{
		Val:   4,
		Left:  &TreeNode{Val: 1},
		Right: &TreeNode{Val: 2},
	}

	expected1 := true
	result1 := isSubtree(root1, subRoot1)
	if result1 != expected1 {
		t.Errorf("Unexpected result. Expected: %v, Got: %v", expected1, result1)
	}

	// Test case 2
	root2 := &TreeNode{
		Val: 3,
		Left: &TreeNode{
			Val:   4,
			Left:  &TreeNode{Val: 1},
			Right: &TreeNode{Val: 2},
		},
		Right: &TreeNode{
			Val:  5,
			Left: &TreeNode{Val: 6},
		},
	}

	subRoot2 := &TreeNode{
		Val:  5,
		Left: &TreeNode{Val: 6},
	}

	expected2 := true
	result2 := isSubtree(root2, subRoot2)
	if result2 != expected2 {
		t.Errorf("Unexpected result. Expected: %v, Got: %v", expected2, result2)
	}
}
