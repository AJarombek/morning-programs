/**
 * https://leetcode.com/problems/reshape-the-matrix/
 * Author: Andrew Jarombek
 * Date: 7/18/2023
 */

package _go

func matrixReshape(mat [][]int, r int, c int) [][]int {
	rows := len(mat)
	cols := len(mat[0])

	if rows*cols != r*c {
		return mat
	}

	result := make([][]int, r)

	for i := 0; i < r; i++ {
		result[i] = make([]int, c)
	}

	for i := 0; i < r*c; i++ {
		result[i/c][i%c] = mat[i/cols][i%cols]
	}

	return result
}
