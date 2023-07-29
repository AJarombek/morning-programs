/**
 * https://leetcode.com/problems/maximum-product-of-three-numbers/
 * Author: Andrew Jarombek
 * Date: 7/29/2023
 */

package _go

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func averageOfLevels(root *TreeNode) []float64 {
	var result []float64
	queue := []*TreeNode{root}

	for len(queue) > 0 {
		var newQueue []*TreeNode
		var sum int

		for i := 0; i < len(queue); i++ {
			node := queue[i]
			sum += node.Val

			if node.Left != nil {
				newQueue = append(newQueue, node.Left)
			}

			if node.Right != nil {
				newQueue = append(newQueue, node.Right)
			}
		}

		result = append(result, float64(sum)/float64(len(queue)))
		queue = newQueue
	}

	return result
}
