/**
 * https://leetcode.com/problems/excel-sheet-column-number/
 * Author: Andrew Jarombek
 * Date: 7/3/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func titleToNumber(columnTitle string) int {
	title := 0

	for _, char := range columnTitle {
		title *= 26
		title += int(char) - 64
	}

	return title
}

func Test(t *testing.T) {
	assert.Equal(t, 28, titleToNumber("AB"))
}
