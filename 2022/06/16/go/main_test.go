/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Author: Andrew Jarombek
 * Date: 6/16/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func maxProfit(prices []int) int {
	result := 0
	buy := prices[0]

	for _, price := range prices[1:] {
		if price < buy {
			buy = price
		} else if val := price - buy; val > result {
			result = val
		}
	}

	return result
}

func TestMaxProfit(t *testing.T) {
	assert.Equal(t, 5, maxProfit([]int {7, 1, 5, 3, 6, 4}))
	assert.Equal(t, 0, maxProfit([]int {7, 6, 4, 3, 1}))
}