/**
 * https://leetcode.com/problems/merge-two-binary-trees/
 * Author: Andrew Jarombek
 * Date: 7/27/2023
 */

package _go

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func mergeTrees(root1 *TreeNode, root2 *TreeNode) *TreeNode {
	if root1 == nil && root2 == nil {
		return nil
	}

	node := &TreeNode{}

	var left1 *TreeNode
	var left2 *TreeNode
	var right1 *TreeNode
	var right2 *TreeNode
	val1 := 0
	val2 := 0

	if root1 != nil {
		left1 = root1.Left
		right1 = root1.Right
		val1 = root1.Val
	}

	if root2 != nil {
		left2 = root2.Left
		right2 = root2.Right
		val2 = root2.Val
	}

	node.Left = mergeTrees(left1, left2)
	node.Right = mergeTrees(right1, right2)
	node.Val = val1 + val2
	return node
}
