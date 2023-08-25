/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * Author: Andrew Jarombek
 * Date: 8/24/2023
 */

package _go

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func searchBST(root *TreeNode, val int) *TreeNode {
	if root == nil {
		return nil
	}

	if root.Val == val {
		return root
	}

	if root.Val > val {
		return searchBST(root.Left, val)
	} else {
		return searchBST(root.Right, val)
	}
}
