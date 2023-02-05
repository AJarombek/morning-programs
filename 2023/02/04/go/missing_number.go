/**
 * https://leetcode.com/problems/missing-number/
 * Author: Andrew Jarombek
 * Date: 2/4/2023
 */

package _go

func missingNumber(nums []int) int {
	set := make(map[int]struct{})

	for _, num := range nums {
		set[num] = struct{}{}
	}

	for i := 0; i <= len(nums); i++ {
		if _, ok := set[i]; !ok {
			return i
		}
	}

	return -1
}
