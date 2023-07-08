/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/7/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestFindMode(t *testing.T) {
	// Test Case 1: Binary tree with single mode
	root1 := &TreeNode{
		Val:  2,
		Left: &TreeNode{Val: 2},
		Right: &TreeNode{
			Val:   3,
			Left:  &TreeNode{Val: 2},
			Right: &TreeNode{Val: 4},
		},
	}
	expected1 := []int{2}
	result1 := findMode(root1)
	if !reflect.DeepEqual(result1, expected1) {
		t.Errorf("Test case 1 failed: Expected %v, but got %v", expected1, result1)
	}

	// Test Case 2: Binary tree with multiple modes
	root2 := &TreeNode{
		Val:  1,
		Left: &TreeNode{Val: 2},
		Right: &TreeNode{
			Val:   2,
			Left:  &TreeNode{Val: 3},
			Right: &TreeNode{Val: 3},
		},
	}
	expected2 := []int{3, 2}
	result2 := findMode(root2)
	if !reflect.DeepEqual(result2, expected2) {
		t.Errorf("Test case 2 failed: Expected %v, but got %v", expected2, result2)
	}
}
