/**
 * https://leetcode.com/problems/majority-element/
 * Author: Andrew Jarombek
 * Date: 6/30/2022
 */

/* WhatsApp */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func majorityElement(nums []int) int {
	chars := make(map[int]int)

	for _, num := range nums {
		val := chars[num] + 1

		if val > len(nums) / 2 {
			return num
		}

		chars[num] = val
	}

	return 0
}

func Test(t *testing.T) {
	slice := []int{3, 2, 3}
	assert.Equal(t, 3, majorityElement(slice))
}