/**
 * https://leetcode.com/problems/degree-of-an-array/
 * Author: Andrew Jarombek
 * Date: 8/10/2023
 */

package _go

func findShortestSubArray(nums []int) int {
	maxDegree := 0
	degree := make(map[int]int)

	for _, num := range nums {
		degree[num]++
		if degree[num] > maxDegree {
			maxDegree = degree[num]
		}
	}

	minLength := len(nums)
	found := make(map[int]bool)

	for i := 0; i < len(nums); i++ {
		if degree[nums[i]] == maxDegree && !found[nums[i]] {
			found[nums[i]] = true

			for j := len(nums) - 1; j >= i; j-- {
				if nums[j] == nums[i] {
					if j-i+1 < minLength {
						minLength = j - i + 1
					}

					break
				}
			}
		}
	}

	return minLength
}
