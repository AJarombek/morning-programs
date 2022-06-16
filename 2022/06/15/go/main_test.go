/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 * Author: Andrew Jarombek
 * Date: 6/15/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func getRow(rowIndex int) []int {
	result := []int {1}

	if rowIndex < 1 {
		return result
	}

	result = append(result, 1)
	index := 1

	for index <= rowIndex {
		row := []int {1}
		i := 1

		for i < index {
			row = append(row, result[i] + result[i - 1])
			i++
		}

		row = append(row, 1)
		result = row
		index++
	}

	return result
}

func TestPascalsTriangle(t *testing.T) {
	assert.Equal(t, []int {1, 3, 3, 1}, getRow(3))
}