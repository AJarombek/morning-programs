/**
 * https://leetcode.com/problems/range-addition-ii/
 * Author: Andrew Jarombek
 * Date: 7/22/2023
 */

package _go

func maxCount(m int, n int, ops [][]int) int {
	minM := m
	minN := n

	for _, op := range ops {
		if op[0] < minM {
			minM = op[0]
		}

		if op[1] < minN {
			minN = op[1]
		}
	}

	return minM * minN
}
