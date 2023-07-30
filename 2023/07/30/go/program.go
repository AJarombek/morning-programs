/**
 * https://leetcode.com/problems/maximum-average-subarray-i/
 * Author: Andrew Jarombek
 * Date: 7/30/2023
 */

package _go

import "math"

func findMaxAverage(nums []int, k int) float64 {
	var sum float64
	var index int
	length := float64(k)

	for index < k {
		sum += float64(nums[index])
		index++
	}

	result := sum / length

	for index < len(nums) {
		sum -= float64(nums[index-k])
		sum += float64(nums[index])
		result = math.Max(result, sum/length)
		index++
	}

	return result
}
