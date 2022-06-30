/**
 * https://leetcode.com/problems/excel-sheet-column-title/
 * Author: Andrew Jarombek
 * Date: 6/29/2022
 */

package _go

import (
	"bytes"
	"github.com/stretchr/testify/assert"
	"testing"
)

func convertToTitle(columnNumber int) string {
	buf := bytes.Buffer{}

	for columnNumber > 0 {
		buf.WriteRune(rune(65 + ((columnNumber - 1) % 26)))
		columnNumber = (columnNumber - 1) / 26
	}

	result := []rune(buf.String())

	for i := 0; i < len(result) / 2; i++ {
		j := len(result) - i - 1
		result[i], result[j] = result[j], result[i]
	}

	return string(result)
}

func Test(t *testing.T) {
	assert.Equal(t, "AB", convertToTitle(28))
}