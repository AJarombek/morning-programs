/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/21/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestPreorderTraversal(t *testing.T) {
	tests := []struct {
		root     *Node
		expected []int
	}{
		{
			root: &Node{Val: 1, Children: []*Node{
				{Val: 3, Children: []*Node{
					{Val: 5},
					{Val: 6},
				}},
				{Val: 2},
				{Val: 4},
			}},
			expected: []int{1, 3, 5, 6, 2, 4},
		},
		{
			root: &Node{Val: 1, Children: []*Node{
				{Val: 2},
				{Val: 3, Children: []*Node{
					{Val: 6},
					{Val: 7},
				}},
			}},
			expected: []int{1, 2, 3, 6, 7},
		},
	}

	for _, test := range tests {
		result := preorder(test.root)
		if !reflect.DeepEqual(result, test.expected) {
			t.Errorf("Expected %v, but got %v", test.expected, result)
		}
	}
}
