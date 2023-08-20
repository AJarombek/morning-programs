/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/20/2023
 */

package _go

import (
	"testing"
)

func TestMaxDepth(t *testing.T) {
	// Test case 1
	root1 := &Node{Val: 1, Children: []*Node{
		{Val: 2},
		{Val: 3},
		{Val: 4},
	}}
	expected1 := 2
	result1 := maxDepth(root1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: expected %d, but got %d", expected1, result1)
	}

	// Test case 2
	root2 := &Node{Val: 1, Children: []*Node{
		{Val: 2, Children: []*Node{
			{Val: 3},
			{Val: 4, Children: []*Node{
				{Val: 5},
			}},
		}},
		{Val: 6},
	}}
	expected2 := 4
	result2 := maxDepth(root2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: expected %d, but got %d", expected2, result2)
	}
}
