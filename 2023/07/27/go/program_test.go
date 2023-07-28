/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/27/2023
 */

package _go

import (
	"testing"
)

func isTreeEqual(t1 *TreeNode, t2 *TreeNode) bool {
	if t1 == nil && t2 == nil {
		return true
	}

	if t1 == nil || t2 == nil {
		return false
	}

	return t1.Val == t2.Val && isTreeEqual(t1.Left, t2.Left) && isTreeEqual(t1.Right, t2.Right)
}

func TestMergeTrees(t *testing.T) {
	// Test case 1: Two empty trees should result in a nil tree.
	result1 := mergeTrees(nil, nil)
	if result1 != nil {
		t.Errorf("Test case 1 failed. Expected nil, but got %v", result1)
	}

	// Test case 2: Two non-empty trees with different values should be merged correctly.
	root1 := &TreeNode{Val: 1, Left: &TreeNode{Val: 2}, Right: &TreeNode{Val: 3}}
	root2 := &TreeNode{Val: 4, Left: &TreeNode{Val: 5}, Right: &TreeNode{Val: 6}}
	expectedResult2 := &TreeNode{
		Val:   5,
		Left:  &TreeNode{Val: 7},
		Right: &TreeNode{Val: 9},
	}
	result2 := mergeTrees(root1, root2)
	if !isTreeEqual(result2, expectedResult2) {
		t.Errorf("Test case 2 failed. Expected %v, but got %v", expectedResult2, result2)
	}
}
