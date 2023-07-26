/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/25/2023
 */

package _go

import (
	"testing"
)

func TestTree2Str(t *testing.T) {
	// Test Case 1: Tree with both left and right children
	root1 := &TreeNode{Val: 1}
	root1.Left = &TreeNode{Val: 2}
	root1.Right = &TreeNode{Val: 3}
	root1.Left.Left = &TreeNode{Val: 4}

	actual1 := tree2str(root1)
	expected1 := "1(2(4))(3)"
	if actual1 != expected1 {
		t.Errorf("Test Case 1 failed - actual: %s, expected: %s", actual1, expected1)
	}

	// Test Case 2: Tree with only a left child
	root2 := &TreeNode{Val: 1}
	root2.Left = &TreeNode{Val: 2}

	actual2 := tree2str(root2)
	expected2 := "1(2)"
	if actual2 != expected2 {
		t.Errorf("Test Case 2 failed - actual: %s, expected: %s", actual2, expected2)
	}
}
