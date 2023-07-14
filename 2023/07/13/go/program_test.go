/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/13/2023
 */

package _go

import (
	"testing"
)

func TestDiameterOfBinaryTreeV2(t *testing.T) {
	// Test case 1
	root1 := &TreeNode{
		Val:   1,
		Left:  &TreeNode{Val: 2},
		Right: &TreeNode{Val: 3},
	}
	expected1 := 2
	result1 := diameterOfBinaryTreeV2(root1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: expected %d, got %d", expected1, result1)
	}

	// Test case 2
	root2 := &TreeNode{
		Val:   1,
		Left:  &TreeNode{Val: 2},
		Right: nil,
	}
	expected2 := 1
	result2 := diameterOfBinaryTreeV2(root2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: expected %d, got %d", expected2, result2)
	}
}
