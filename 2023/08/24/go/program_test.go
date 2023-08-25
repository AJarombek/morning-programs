/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/24/2023
 */

package _go

import (
	"testing"
)

func TestSearchBST(t *testing.T) {
	// Creating a sample tree for testing
	root := &TreeNode{
		Val: 4,
		Left: &TreeNode{
			Val:   2,
			Left:  &TreeNode{Val: 1},
			Right: &TreeNode{Val: 3},
		},
		Right: &TreeNode{Val: 7},
	}

	tests := []struct {
		root     *TreeNode
		val      int
		expected *TreeNode
	}{
		{
			root:     root,
			val:      2,
			expected: root.Left,
		},
		{
			root:     root,
			val:      5,
			expected: nil,
		},
	}

	for _, test := range tests {
		result := searchBST(test.root, test.val)
		if result != test.expected {
			t.Errorf("For value %d, expected %v but got %v", test.val, test.expected, result)
		}
	}
}
