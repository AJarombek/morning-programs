/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 * Author: Andrew Jarombek
 * Date: 8/22/2023
 */

package _go

func isToeplitzMatrix(matrix [][]int) bool {
	for i := 1; i < len(matrix); i++ {
		for j := 1; j < len(matrix[0]); j++ {
			if matrix[i][j] != matrix[i-1][j-1] {
				return false
			}
		}
	}

	return true
}
