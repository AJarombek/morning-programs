/**
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 * Author: Andrew Jarombek
 * Date: 8/17/2023
 */

package _go

func dominantIndex(nums []int) int {
	index := -1
	first := 0
	second := 0

	for i, num := range nums {
		if num > first {
			second = first
			first = num
			index = i
		} else if num > second {
			second = num
		}
	}

	if second*2 > first {
		return -1
	}

	return index
}
