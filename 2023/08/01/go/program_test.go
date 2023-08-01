/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/1/2023
 */

package _go

import (
	"testing"
)

// Helper function to create a TreeNode.
func createNode(val int, left *TreeNode, right *TreeNode) *TreeNode {
	return &TreeNode{
		Val:   val,
		Left:  left,
		Right: right,
	}
}

func TestFindTarget(t *testing.T) {
	// Test Case 1: Tree has a pair of nodes with the sum k=9.
	root1 := createNode(5, createNode(3, createNode(2, nil, nil), createNode(4, nil, nil)), createNode(6, nil, createNode(7, nil, nil)))
	k1 := 9
	if !findTarget(root1, k1) {
		t.Errorf("Test case 1 failed: Expected true, got false")
	}

	// Test Case 2: Tree has no pair of nodes with the sum k=10.
	root2 := createNode(5, createNode(3, createNode(2, nil, nil), createNode(4, nil, nil)), createNode(6, nil, createNode(7, nil, nil)))
	k2 := 14
	if findTarget(root2, k2) {
		t.Errorf("Test case 2 failed: Expected false, got true")
	}
}
