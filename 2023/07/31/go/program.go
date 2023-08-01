/**
 * https://leetcode.com/problems/set-mismatch/
 * Author: Andrew Jarombek
 * Date: 7/31/2023
 */

package _go

func findErrorNums(nums []int) []int {
	numMap := make(map[int]struct{})

	missing := 0
	duplicate := 0

	for _, num := range nums {
		if _, ok := numMap[num]; ok {
			duplicate = num
		}

		numMap[num] = struct{}{}
	}

	for i := 1; i <= len(nums); i++ {
		if _, ok := numMap[i]; !ok {
			missing = i
			break
		}
	}

	return []int{duplicate, missing}
}
