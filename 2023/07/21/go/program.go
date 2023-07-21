/**
 * https://leetcode.com/problems/longest-harmonious-subsequence/
 * Author: Andrew Jarombek
 * Date: 7/21/2023
 */

package _go

func findLHS(nums []int) int {
	counts := make(map[int]int)

	for _, num := range nums {
		counts[num]++
	}

	max := 0

	for key, value := range counts {
		if counts[key+1] != 0 && value+counts[key+1] > max {
			max = value + counts[key+1]
		}
	}

	return max
}
