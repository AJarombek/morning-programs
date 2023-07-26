/**
 * https://leetcode.com/problems/construct-string-from-binary-tree/
 * Author: Andrew Jarombek
 * Date: 7/25/2023
 */

package _go

import "strconv"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func tree2str(root *TreeNode) string {
	if root == nil {
		return ""
	}

	result := strconv.Itoa(root.Val)

	if root.Left == nil && root.Right == nil {
		return result
	}

	result += "(" + tree2str(root.Left) + ")"

	if root.Right != nil {
		result += "(" + tree2str(root.Right) + ")"
	}

	return result
}
