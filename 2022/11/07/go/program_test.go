/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 11/7/2022
 */

package _go

import "testing"

func TestInvertTree(t *testing.T) {
	originalTree := TreeNode{Val: 2, Left: &TreeNode{1, nil, nil}, Right: &TreeNode{3, nil, nil}}
	tree := invertTree(&originalTree)
	
	if tree.Val != 2 {
		t.Errorf(`tree.Val != 2`)
	}

	if tree.Left.Val != 3 {
		t.Errorf(`tree.Left.Val != 3`)
	}

	if tree.Right.Val != 1 {
		t.Errorf(`tree.Right.Val != 1`)
	}
}
