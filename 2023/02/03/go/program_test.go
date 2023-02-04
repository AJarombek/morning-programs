/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 2/3/2023
 */

package _go

import "testing"

func TestBinaryTreePaths(t *testing.T) {
	tree := &TreeNode{Val: 1, Left: &TreeNode{Val: 2, Left: nil, Right: &TreeNode{Val: 5}}, Right: &TreeNode{Val: 3}}
	result := binaryTreePaths(tree)

	if len(result) != 2 {
		t.Errorf(`len(binaryTreePaths(tree)) != 2`)
	}

	if result[0] != "1->2->5" {
		t.Errorf(`binaryTreePaths(tree)[0] != "1->2->5"`)
	}

	if result[1] != "1->3" {
		t.Errorf(`binaryTreePaths(tree)[1] != "1->3"`)
	}
}
