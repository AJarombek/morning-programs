/**
 * https://leetcode.com/problems/pascals-triangle/
 * Author: Andrew Jarombek
 * Date: 6/14/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func generate(numRows int) [][]int {
	result := [][]int { {1} }

	if numRows < 2 {
		return result
	}

	result = append(result, []int {1, 1})
	index := 2

	for index < numRows {
		row := []int {1}
		i := 1

		for i < index {
			row = append(row, result[len(result) - 1][i] + result[len(result) - 1][i - 1])
			i++
		}

		row = append(row, 1)
		result = append(result, row)
		index++
	}

	return result
}

func TestPascalsTriangle(t *testing.T) {
	result := generate(4)

	assert.Equal(t, []int {1}, result[0])
	assert.Equal(t, []int {1, 1}, result[1])
	assert.Equal(t, []int {1, 2, 1}, result[2])
	assert.Equal(t, []int {1, 3, 3, 1}, result[3])
}