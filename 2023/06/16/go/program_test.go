/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/16/2023
 */

package _go

import "testing"

func TestSumOfLeftLeaves1(t *testing.T) {
	// Construct the tree: [3, 9, 20, null, null, 15, 7]
	root := &TreeNode{
		Val: 3,
		Left: &TreeNode{
			Val: 9,
		},
		Right: &TreeNode{
			Val: 20,
			Left: &TreeNode{
				Val: 15,
			},
			Right: &TreeNode{
				Val: 7,
			},
		},
	}
	expected := 24

	result := sumOfLeftLeaves(root)

	if result != expected {
		t.Errorf("Expected sum of left leaves to be %d, but got %d", expected, result)
	}
}

func TestSumOfLeftLeaves2(t *testing.T) {
	// Construct the tree: [1, 2, 3, 4, 5]
	root := &TreeNode{
		Val: 1,
		Left: &TreeNode{
			Val: 2,
			Left: &TreeNode{
				Val: 4,
			},
		},
		Right: &TreeNode{
			Val: 3,
			Left: &TreeNode{
				Val: 5,
			},
		},
	}
	expected := 9

	result := sumOfLeftLeaves(root)

	if result != expected {
		t.Errorf("Expected sum of left leaves to be %d, but got %d", expected, result)
	}
}
