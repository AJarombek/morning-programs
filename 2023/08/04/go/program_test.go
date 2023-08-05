/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/4/2023
 */

package _go

import (
	"testing"
)

// Helper function to create a new TreeNode with the given value.
func createNode(val int) *TreeNode {
	return &TreeNode{
		Val:   val,
		Left:  nil,
		Right: nil,
	}
}

func TestFindSecondMinimumValue(t *testing.T) {
	// Test Case 1: Test a valid binary tree with a second minimum value
	root1 := createNode(2)
	root1.Left = createNode(2)
	root1.Right = createNode(2)
	root1.Left.Left = createNode(5)
	root1.Left.Right = createNode(8)
	root1.Right.Left = createNode(7)
	root1.Right.Right = createNode(10)
	expected1 := 5

	result1 := findSecondMinimumValue(root1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: Expected %v, got %v", expected1, result1)
	}

	// Test Case 2: Test a binary tree with no second minimum value
	root2 := createNode(2)
	root2.Left = createNode(2)
	root2.Right = createNode(2)
	expected2 := -1

	result2 := findSecondMinimumValue(root2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: Expected %v, got %v", expected2, result2)
	}
}
