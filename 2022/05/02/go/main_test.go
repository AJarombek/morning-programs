/**
 * https://leetcode.com/problems/plus-one/
 * Author: Andrew Jarombek
 * Date: 5/2/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func plusOne(digits []int) []int {
    remainder := 1

    for i := len(digits) - 1; i >= 0; i-- {
        val := digits[i] + remainder
        remainder = val / 10
        digits[i] = val % 10
    }

    if remainder == 1 {
        result := make([]int, len(digits) + 1)
        result[0] = 1

        for i := 1; i < len(result); i++ {
            result[i] = digits[i - 1]
        }

        return result
    }

    return digits;
}

func TestPlusOne(t *testing.T) {
	number := make([]int, 1)
	number[0] = 9

	result := plusOne(number)
	assert.Equal(t, 1, result[0])
	assert.Equal(t, 0, result[1])
}