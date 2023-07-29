/**
 * https://leetcode.com/problems/maximum-product-of-three-numbers/
 * Author: Andrew Jarombek
 * Date: 7/28/2023
 */

package _go

import (
	"math"
	"sort"
)

func maximumProduct(nums []int) int {
	sort.Ints(nums)

	n := nums[0] * nums[1] * nums[len(nums)-1]
	m := nums[len(nums)-1] * nums[len(nums)-2] * nums[len(nums)-3]

	return int(math.Max(float64(n), float64(m)))
}
