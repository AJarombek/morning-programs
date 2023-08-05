/**
 * https://leetcode.com/problems/image-smoother/
 * Author: Andrew Jarombek
 * Date: 8/4/2023
 */

package _go

import "math"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func findSecondMinimumValue(root *TreeNode) int {
	val := root.Val
	result := math.MaxInt64
	queue := []*TreeNode{root}

	for len(queue) > 0 {
		node := queue[0]

		if node.Val != val {
			if result == math.MaxInt64 || node.Val < result {
				result = node.Val
			}
		} else {
			if node.Left != nil {
				queue = append(queue, node.Left)
			}

			if node.Right != nil {
				queue = append(queue, node.Right)
			}
		}

		queue = queue[1:]
	}

	if result == math.MaxInt64 {
		return -1
	}

	return result
}
