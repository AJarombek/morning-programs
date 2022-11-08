/**
 * https://leetcode.com/problems/invert-binary-tree/
 * Author: Andrew Jarombek
 * Date: 11/7/2022
 */

package _go

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func invertTree(root *TreeNode) *TreeNode {
	if root == nil {
		return nil
	}

	left := root.Left
	root.Left = invertTree(root.Right)
	root.Right = invertTree(left)

	return root
}
